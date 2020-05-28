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
public class TestProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product p = new DimensionalProduct();
        try {
            p.choices();
        } catch (Exception ex) {
            System.err.println("  there error :(  "+ex);
        }

    }
}
