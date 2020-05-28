/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp probook 450g5
 */
public abstract class Product {

    private int product_id;
    private String product_name;
    private String product_description;
    private double product_price;
//    ArrayBag<Product> p = new ArrayBag();
    private ArrayList<Product> p = new ArrayList<>();

    public Product(int product_id, String product_name, String product_description, double product_price) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_description = product_description;
        this.product_price = product_price;
    }
    private Scanner s = new Scanner(System.in);

    @Override
    public String toString() {
        return "Product{" + "product_id=" + product_id + ", product_name=" + product_name + ", product_description=" + product_description + ", product_price=" + product_price + '}';
    }

    public double calcPay() {
        return getProduct_price();
    }

    public Product() {
    }

    /**
     * @return the product_id
     */
    public int getProduct_id() {
        return product_id;
    }

    /**
     * @param product_id the product_id to set
     */
    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    /**
     * @return the product_name
     */
    public String getProduct_name() {
        return product_name;
    }

    /**
     * @param product_name the product_name to set
     */
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    /**
     * @return the product_description
     */
    public String getProduct_description() {
        return product_description;
    }

    /**
     * @param product_description the product_description to set
     */
    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    /**
     * @return the product_price
     */
    public double getProduct_price() {
        return product_price;
    }

    /**
     * @param product_price the product_price to set
     */
    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    /**
     * @return the s
     */
    public Scanner getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(Scanner s) {
        this.s = s;

    }

    public void choices() throws FileNotFoundException {
        boolean check = true;
        while (check) {

            System.out.println(">>>>> Choices <<<<< \n" + "1- Show All Products \n" + "2- Add Product \n" + "3- Delete Product  \n"
                    + "4- Edit Product  \n" + "5- Calculate Total Price \n" + "6- Save data to file  \n"
                    + "7- Exit" + "\n Enter your choice: ");

            int input = s.nextInt();
            s.nextLine();
            switch (input) {
                case 1:
                    Show_All_Products();
                    break;
                case 2:
                    Add_Product();
                    break;
                case 3:
                    Delete_Product();
                    break;
                case 4:
                    Edit_Product();
                    break;
                case 5:
                    Calculate_Total_Price();
                    break;
                case 6:
                    Save_data_to_file();
                    break;
                case 7:
                    check = false;
                    break;
                default:
                    System.out.println("Enter corect choice");

            }
        }

    }

     private void Show_All_Products() throws FileNotFoundException {
        System.out.println("Enter type of product w/d : ");
        String type = s.next();
        for (Product product : p) {
            if (type.equalsIgnoreCase("w") && product instanceof WeightedProduct) {
                System.out.println(product);
            } else if (type.equalsIgnoreCase("D") && product instanceof DimensionalProduct) {
                System.out.println(product);
            }
        }
    }

    private void Add_Product() {
        System.out.println(">>>>> Add Product <<<<< ");
        System.out.println("Enter type of product : ");
        String type = s.next();
        s.nextLine();
        System.out.println("Enter ID :");
        int id = s.nextInt();
        s.nextLine();
        System.out.println("Enter Name");
        String Name = s.nextLine();
        System.out.println("Enter description");
        String de = s.nextLine();
        System.out.println("Enter price");
        int price = s.nextInt();

        if (type.equalsIgnoreCase("w")) {
            System.out.println("Enter weight");
            double w = s.nextDouble();
            p.add(new WeightedProduct(w, id, Name, de, price));
        } else if (type.equalsIgnoreCase("D")) {
            System.out.println("Enter width");
            int width = s.nextInt();
            System.out.println("Enter length");
            int length = s.nextInt();
            System.out.println("The Product has been successfully added . :)");
            p.add(new DimensionalProduct(width, length, id, Name, de, price));

        } else {
            System.out.println("Type should be d or w");
        }
    }

    private void Delete_Product() {
        System.out.println(">>>>> Delete Product <<<<<");
        System.out.println("Enter id : ");
        int id = s.nextInt();
        boolean test = false;
        for (Product product : p) {
            if (id == product.getProduct_id()) {
                p.remove(product);
                test = true;
                break;
            }
        }
        if (test) {
            System.out.println("The product has been successfully deleted. :)");
        } else {
            System.out.println(" not successfully deleted :(");
        }

    }

    private void Edit_Product() {
        System.out.println(">>>>> Edit Product <<<<<");
        System.out.println("Enter id : ");
        int id = s.nextInt();
        boolean test = false;
        for (Product pp : p) {

            if (id == pp.getProduct_id()) {
                if (pp instanceof WeightedProduct) {
                    System.out.println(pp);
                    System.out.println("Enter new ID :");
                    pp.setProduct_id(s.nextInt());
                    s.nextLine();
                    System.out.println("Enter new Name");
                    pp.setProduct_name(s.nextLine());
                    System.out.println("Enter new description");
                    pp.setProduct_description(s.nextLine());
                    System.out.println("Enter new price");
                    pp.setProduct_price(s.nextInt());
                    System.out.println("Enter new weight");
                    ((WeightedProduct) pp).setWeight(s.nextInt());
                    test = true;
                    break;
                } else if (pp instanceof DimensionalProduct) {

                    System.out.println(pp);
                    System.out.println("Enter new ID :");
                    pp.setProduct_id(s.nextInt());
                    s.nextLine();
                    System.out.println("Enter new Name");
                    pp.setProduct_name(s.nextLine());
                    System.out.println("Enter new description");
                    pp.setProduct_description(s.nextLine());
                    System.out.println("Enter new price");
                    pp.setProduct_price(s.nextInt());
                    System.out.println("Enter width");
                    ((DimensionalProduct) pp).setWidth(s.nextInt());
                    System.out.println("Enter length");
                    ((DimensionalProduct) pp).setLength(s.nextInt());
                    test = true;
                    break;
                }

            }
        }
        if (test) {
            System.out.println("The Product data was successfully Edit. :)");
        } else {
            System.out.println("The  Product data wasn't successfully Edit. :( ");
        }

    }

    private void Calculate_Total_Price() {
        double total = 0;
        for (Product pp : p) {
            if (pp instanceof WeightedProduct) {
                total += pp.calcPay();
            } else if (pp instanceof DimensionalProduct) {
                total += pp.calcPay();

            }

        }
        System.out.println("total price is : " + total);

    }

    private void Save_data_to_file() {
        File f = new File("ProjectFile");
        PrintWriter pw = null;
        f.mkdir();
        if (f.exists()) {
            File f2 = new File(f.getPath() + "\\projec.txt");
            try {
                f2.createNewFile();
                pw = new PrintWriter(f2);
            } catch (Exception ex) {
                System.err.println(ex);
            }
            for (Product pp : p) {
                pw.println(pp.toString());
            }
            System.out.println("tm");
            pw.close();
        }

    }
}
