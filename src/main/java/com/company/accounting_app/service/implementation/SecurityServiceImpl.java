package com.company.accounting_app.service.implementation;


import com.company.accounting_app.entity.User;
import com.company.accounting_app.entity.common.UserPrincipal;
import com.company.accounting_app.repository.UserRepository;
import com.company.accounting_app.service.SecurityService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class SecurityServiceImpl implements SecurityService {
    private final UserRepository userRepository;

    public SecurityServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username).orElseThrow(
                () -> new UsernameNotFoundException("This user does not exist"));
        return new UserPrincipal(user);
    }

}
