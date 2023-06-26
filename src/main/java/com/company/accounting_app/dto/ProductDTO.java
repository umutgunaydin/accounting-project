package com.company.accounting_app.dto;

import com.company.accounting_app.enums.ProductUnit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private Long id;
    private String name;
    private int quantityInStock;
    private int lowLimitAlert;
    private ProductUnit productUnit;
    private CategoryDTO category;
}
