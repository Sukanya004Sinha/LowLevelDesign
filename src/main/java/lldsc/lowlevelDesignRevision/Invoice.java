//package lldsc.lowlevelDesignRevision;
//
//public class Invoice {
//    Markers markers;
//    int quantity;
//
//    public Invoice(Markers marker, int quantity){
//        this.markers = marker;
//        this.quantity = quantity;
//    }
//    public int calculateTotal(){
//        int price = ((markers.price)*quantity);
//        return price;
//    }
//    public int printInvoice() {
//        System.out.println("Marker name : " + markers.name);
//        System.out.println("Marker.price: " + markers.price);
//        System.out.println("Marker.yearOfManufacture: " + markers.yearOfManufacture);
//        System.out.println("Marker Color" + markers.Color);
//        System.out.println("Quantity: " + quantity);
//        System.out.println("TotalPrice: " + calculateTotal());
//        return calculateTotal();
//
//    }
//    public void saveToDB(){
//        //logic to save to DB
//        System.out.println("Invoice saved to DB");
//        System.out.println("Marker name : " + markers.name);
//        System.out.println("Marker.price: " + markers.price);
//        System.out.println("Marker.yearOfManufacture: " + markers.yearOfManufacture);
//        System.out.println("Marker Color" + markers.Color);
//        System.out.println("Quantity: " + quantity);
//        System.out.println("TotalPrice: " + calculateTotal());
//
//
//    }
//}
