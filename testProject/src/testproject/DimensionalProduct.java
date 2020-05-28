/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testproject;

/**
 *
 * @author hp probook 450g5
 */
public class DimensionalProduct extends Product {

    public int width;
    public int length;

    public DimensionalProduct(int width, int length, int product_id, String product_name, String product_description, double product_price) {
        super(product_id, product_name, product_description, product_price);
        this.width = width;
        this.length = length;
    }

    public DimensionalProduct() {
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public double calcPay() {
        return width * length * this.getProduct_price();
    }

    @Override
    public String toString() {
        return "DimensionalProduct{" + "product_id=" + getProduct_id() + ", product_name=" + getProduct_name() + ", product_description=" + getProduct_description() + ", product_price=" + getProduct_price() + "width=" + width + ", length=" + length + '}';
    }

}
