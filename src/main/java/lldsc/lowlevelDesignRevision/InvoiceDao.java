//package lldsc.lowlevelDesignRevision;
//
//public class InvoiceDao {
//    InvoiceUsingSingleResponsibility invoice;
//
//    public InvoiceDao(InvoiceUsingSingleResponsibility invoice) { // Fixed parameter capitalization
//        this.invoice = invoice;
//    }
//
//    public void saveToDB() {
//        // logic to save to DB
//        System.out.println("Invoice saved to DB");
//        System.out.println("Marker name: " + invoice.marker.name); // Fixed access to marker
//        System.out.println("Marker price: " + invoice.marker.price);
//        System.out.println("Marker yearOfManufacture: " + invoice.marker.yearOfManufacture);
//        System.out.println("Marker Color: " + invoice.marker.Color);
//        System.out.println("Quantity: " + invoice.quantity);
//        System.out.println("Total Price: " + invoice.calculateTotal());
//    }
//}