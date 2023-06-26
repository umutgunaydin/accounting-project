package com.company.accounting_app.enums;

public enum InvoiceStatus {

    AWAITING_APPROVAL("Awaiting Approval"),APPROVED("Approved");

    private final String value;

    InvoiceStatus(String value) {
        this.value = value;
    }
}
