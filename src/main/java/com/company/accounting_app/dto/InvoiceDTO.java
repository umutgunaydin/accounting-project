package com.company.accounting_app.dto;

import com.company.accounting_app.entity.ClientVendor;
import com.company.accounting_app.enums.InvoiceStatus;
import com.company.accounting_app.enums.InvoiceType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceDTO {

    private Long id;
    private String invoiceNo;
    private InvoiceStatus invoiceStatus;
    private InvoiceType invoiceType;
    private LocalDate date;
    private CompanyDTO company;
    private ClientVendorDTO clientVendor;
    private BigDecimal price;
    private Integer tax;
    private BigDecimal total;

}
