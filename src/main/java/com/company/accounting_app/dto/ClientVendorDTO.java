package com.company.accounting_app.dto;

import com.company.accounting_app.entity.Address;
import com.company.accounting_app.entity.Company;
import com.company.accounting_app.enums.ClientVendorType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientVendorDTO {

    private Long id;
    private String clientVendorName;
    private String phone;
    private String website;
    private ClientVendorType clientVendorType;
    private Address address;
    private Company company;

}
