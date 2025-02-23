package com.lld.lowleveldesign.solidprinciple.SingleResponsibilityPrinciple.dao;

import com.lld.lowleveldesign.solidprinciple.SingleResponsibilityPrinciple.Invoice;

public class DatabaseInvoiceDao implements InterfaceDao{
    @Override
    public  void save(Invoice invoice) {
        //save to  DB
    }
}
class FileInvoiceDao implements InterfaceDao                                                                                             {


        @Override
        public void save(Invoice invoice){
            //save to file

    }
}
