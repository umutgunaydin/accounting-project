package com.company.accounting_app.service.implementation;

import com.company.accounting_app.dto.CompanyDTO;
import com.company.accounting_app.service.CompanyService;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {


    @Override
    public CompanyDTO getCompanyDtoByLoggedInUser() {
        return null;
    }
}
