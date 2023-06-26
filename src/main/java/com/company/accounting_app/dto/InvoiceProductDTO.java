package com.company.accounting_app.dto;

import com.company.accounting_app.entity.Invoice;
import com.company.accounting_app.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceProductDTO {

    private Long id;
    private int quantity;
    private BigDecimal price;
    private int tax;
    private BigDecimal total;
    private BigDecimal profitLoss;
    private int remainingQty;
    private Invoice invoice;
    private Product product;

}
