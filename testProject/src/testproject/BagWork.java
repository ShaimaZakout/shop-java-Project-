/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

/**
 *
 * @author hp
 */
public class BagWork {
//    public void Show_All_Products() {
//        System.out.println("Enter type of product w/d : ");
//        String type = s.next();
//        Object[] toArray = bag.toArray();
//        for (int i = 0; i < toArray.length; i++) {
//            if (type.equalsIgnoreCase("w") && toArray[i] instanceof WeightedProduct) {
//                System.out.println(toArray[i]);
//            } else if (type.equalsIgnoreCase("D") && toArray[i] instanceof DimensionalProduct) {
//                System.out.println(toArray[i]);
//            }
//        }
//    }
//
//    public void Add_Product() {
//        System.out.println(">>>>> Add Product <<<<< ");
//        System.out.println("Enter type of product : ");
//        String type = s.next();
//        s.nextLine();
//        System.out.println("Enter ID :");
//        int id = s.nextInt();
//        s.nextLine();
//        System.out.println("Enter Name");
//        String Name = s.nextLine();
//        System.out.println("Enter description");
//        String p = s.nextLine();
//        System.out.println("Enter price");
//        int price = s.nextInt();
//
//        if (type.equalsIgnoreCase("w")) {
//            System.out.println("Enter weight");
//            double w = s.nextDouble();
//            bag.add(new WeightedProduct(w, id, Name, p, price));
//        } else if (type.equalsIgnoreCase("D")) {
//            System.out.println("Enter width");
//            int width = s.nextInt();
//            System.out.println("Enter length");
//            int length = s.nextInt();
//            System.out.println("The Product has been successfully added . :)");
//            bag.add(new DimensionalProduct(width, length, id, Name, p, price));
//        }
//    }
//
//    public void Delete_Product() {
//        boolean remove = false;
//         System.out.println(">>>>>  Delete Product <<<<<");
//        System.out.println("Enter id:");
//          int id = s.nextInt();
////           Object[] toArray = bag.toArray();
////        for (int i = 0; i < toArray.length; i++) {
////            if (type.equalsIgnoreCase("w") && toArray[i] instanceof WeightedProduct) {
////                System.out.println(toArray[i]);
////            } else if (type.equalsIgnoreCase("D") && toArray[i] instanceof DimensionalProduct) {
////                System.out.println(toArray[i]);
////             }  
//        while (!bag.isEmpty()) {
//             if (getProduct_id() == id) {
//                remove = bag.remove(this);
//                System.out.println("d,d,dd");
//             }
//        }
//   
//        if (remove) {
//            System.out.println("The Product has been successfully deleted. :)");
//        } else {
//            System.out.println("The Product has been not successfully deleted. :(");
//        }
//
//    }
//
//    public void Edit_Product() {
//        boolean tf = false;
//        System.out.println(">>>>>  Edit Product <<<<<");
//        System.out.println("Enter id:");
//        int id = s.nextInt();
//         Object[] toArray = bag.toArray();
//        for (int i = 0; i < toArray.length; i++) {
//            if (type.equalsIgnoreCase("w") && toArray[i] instanceof WeightedProduct) {
//                System.out.println(toArray[i]);
//            } else if (type.equalsIgnoreCase("D") && toArray[i] instanceof DimensionalProduct) {
//                System.out.println(toArray[i]);
//            }
//        
//        
//        
//        
//        
//        while (!bag.isEmpty()) {
////            Product pp = bag.remove();
//            if (pp.getProduct_id() == id) {
//                if (pp instanceof WeightedProduct) {
//                    System.out.println(pp);
//                    System.out.println("Enter new ID :");
//                    pp.setProduct_id(s.nextInt());
//                    System.out.println("Enter new Name");
//                    pp.setProduct_name(s.nextLine());
//                    System.out.println("Enter new description");
//                    pp.setProduct_description(s.nextLine());
//                    System.out.println("Enter new price");
//                    pp.setProduct_price(s.nextInt());
//                    System.out.println("Enter new weight");
//                    ((WeightedProduct) pp).setWeight(s.nextInt());
//                    tf = true;
//                    break;
//                } else if (pp instanceof DimensionalProduct) {
//                    System.out.println(pp);
//                    System.out.println("Enter new ID :");
//                    pp.setProduct_id(s.nextInt());
//                    System.out.println("Enter new Name");
//                    pp.setProduct_name(s.nextLine());
//                    System.out.println("Enter new description");
//                    pp.setProduct_description(s.nextLine());
//                    System.out.println("Enter new price");
//                    pp.setProduct_price(s.nextInt());
//                    System.out.println("Enter width");
//                    ((DimensionalProduct) pp).setWidth(s.nextInt());
//                    System.out.println("Enter length");
//                    ((DimensionalProduct) pp).setLength(s.nextInt());
//                    tf = true;
//                    break;
//                }
//
//            }
//        }
//        if (tf) {
//            System.out.println("The Product data was successfully Edit. :)");
//        } else {
//            System.out.println("The  Product data wasn't successfully Edit. :( ");
//        }
//
//    }
//
//    public void Calculate_Total_Price() {
//        double total = 0;
//        while (!bag.isEmpty()) {
//            Product pp = bag.remove();
//
//            if (pp instanceof WeightedProduct) {
//                total += pp.calcPay();
//            } else if (pp instanceof DimensionalProduct) {
//                total += pp.calcPay();
//
//            }
//        }
//
////         Product[] toArray = bag.toArray();
////        for (Product product : toArray) {
////        
////        }
////        System.out.println("total price is : " + total);
////    }}
//    }
//
//    private void Save_data_to_file() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}
