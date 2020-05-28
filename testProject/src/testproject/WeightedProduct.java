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
public class WeightedProduct extends Product {

    public double weight;

    public WeightedProduct(double weight, int product_id, String product_name, String product_description, double product_price) {
        super(product_id, product_name, product_description, product_price);
        this.weight = weight;
    }

    public WeightedProduct(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "WeightedProduct{" + "product_id=" + getProduct_id() + ", product_name=" + getProduct_name() + ", product_description=" + getProduct_description() + ", product_price=" + getProduct_price() + "weight=" + weight + '}';
    }

    @Override
    public double calcPay() {
        return weight * this.getProduct_price();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
