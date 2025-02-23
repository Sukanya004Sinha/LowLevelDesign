package com.lld.lowleveldesign.solidprinciple.SingleResponsibilityPrinciple.dao;

import com.lld.lowleveldesign.solidprinciple.SingleResponsibilityPrinciple.Invoice;

public abstract class InvoiceDao {
    Invoice invoice;

    public InvoiceDao (Invoice invoice)
    {
        this.invoice= invoice;
    }
    public void saveTODB(){

    }

    public abstract void save(Invoice invoice);
}
