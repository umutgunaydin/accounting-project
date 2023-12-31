package com.company.accounting_app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Long id;

    private String username, password, confirmPassword, firstName, lastName, phone;

    private RoleDTO role;

    private CompanyDTO company;

    private boolean isOnlyAdmin;

}
