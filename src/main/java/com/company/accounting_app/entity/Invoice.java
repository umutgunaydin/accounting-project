package com.company.accounting_app.entity;

import com.company.accounting_app.enums.InvoiceStatus;
import com.company.accounting_app.enums.InvoiceType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "invoices")
@Where(clause = "is_deleted=false")
public class Invoice extends BaseEntity{

    private String invoiceNo;
    @Enumerated(EnumType.STRING)
    private InvoiceStatus invoiceStatus;
    @Enumerated(EnumType.STRING)
    private InvoiceType invoiceType;
    @Column(columnDefinition = "DATE")
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name = "client_vendor_id")
    private ClientVendor clientVendor;
    @ManyToOne
    private Company company;

}
