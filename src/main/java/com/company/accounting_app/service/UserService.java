package com.company.accounting_app.service;

import com.company.accounting_app.dto.UserDTO;

public interface UserService {

    UserDTO findByUsername(String Username);
}
