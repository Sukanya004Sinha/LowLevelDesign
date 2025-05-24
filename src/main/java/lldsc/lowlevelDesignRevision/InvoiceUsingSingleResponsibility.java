//package lldsc.lowlevelDesignRevision;
//
//public class InvoiceUsingSingleResponsibility {
//
//    Markers marker; // Corrected type and field name
//    int quantity;
//
//    public InvoiceUsingSingleResponsibility(Markers marker, int quantity) {
//        this.marker = marker;
//        this.quantity = quantity;
//    }
//
//    public int calculateTotal() {
//        int price = (marker.price * quantity); // Corrected field usage
//        return price;
//    }
//
//    public static void main(String[] args) {
//        Markers marker = new Markers("markers1", 10, 2023, "Red"); // Corrected class name and instantiation
//        InvoiceUsingSingleResponsibility invoice = new InvoiceUsingSingleResponsibility(marker, 5);
//        System.out.println("Total Price: " + invoice.calculateTotal());
//
//        InvoiceDao invoiceDao = new InvoiceDao(invoice);
//        invoiceDao.saveToDB();
//
//        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
//        invoicePrinter.printInvoice();
//    }
////}