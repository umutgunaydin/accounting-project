package com.company.accounting_app.enums;

public enum InvoiceType {

    PURCHASE("Purchase"),SALES("Sales");

    private final String value;

    InvoiceType(String value) {
        this.value = value;
    }
}