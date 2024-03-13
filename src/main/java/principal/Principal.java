/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import clases.*;
/**
 *
 * @author Robinson Concha
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cocina cocina = new Cocina();
        PizzaBuilder hawai_pizzabuilder = new HawaiPizzaBuilder();
        PizzaBuilder picante_pizzabuilder = new PicantePizzaBuilder();
        
        cocina.setPizzaBuilder(hawai_pizzabuilder);
        cocina.construirPizza();
        
        cocina.setPizzaBuilder(picante_pizzabuilder);
        cocina.construirPizza();
        
        Pizza pizza = cocina.getPizza();
    }
    
}
