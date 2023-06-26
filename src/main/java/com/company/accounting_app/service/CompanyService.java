package com.company.accounting_app.service;

import com.company.accounting_app.dto.CompanyDTO;

public interface CompanyService {

    CompanyDTO getCompanyDtoByLoggedInUser();
}
