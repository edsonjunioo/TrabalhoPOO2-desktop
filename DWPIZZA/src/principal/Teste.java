
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;


import control.ClienteControl;
import model.beam.Cliente;
import model.beam.Pizza;
import model.beam.PizzaCalabresa;
import model.beam.PizzaFrango;
import model.beam.PizzaMarguerita;
import model.beam.PizzaMussarela;
import model.beam.PizzaPortuguesa;
import view.TelaCadstroCliente;
import view.TelaLoginCliente;

/**
 *
 * @author Henrique
 */
public class Teste {
    public static void main(String[] args) {
        TelaLoginCliente theView1 = new TelaLoginCliente();
        theView1.setVisible(true);
        dispose();
        TelaCadstroCliente theView = new TelaCadstroCliente();
        Cliente theModel = new Cliente();
        ClienteControl theController = new ClienteControl(theView,theModel);
        
        theView.setVisible(true);
    }

    private static void dispose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    Pizza sA1 = new PizzaCalabresa();
    Pizza sA2 = new PizzaMarguerita();
    Pizza sB1 = new PizzaMussarela();
    Pizza sB2 = new PizzaPortuguesa();
    Pizza sC1 = new PizzaFrango();
    Pizza sC2 = new PizzaPortuguesa();
        
    /*
        sA1 = new AdicionalBorda(sA1);
        sA1 = new AdicionalTomateSeco(sA1);
        sB1 = new AdicionalTomateSeco(sB1);
        sB2 = new AdicionalChampignon(sB2);
      */
    /*
        System.out.println("Cardapio de Pizzas e Preços");
        
        System.out.println(sA1.getDescricao() + " PRECO: " + sA1.getCusto());
        
        
        
        System.out.println("Sugestões com adicionais");
        
        System.out.println(sA1.getDescricao() + " PRECO: " + sA1.getCusto());
        System.out.println(sA2.getDescricao() + " PRECO: " + sA2.getCusto());
        System.out.println(sB1.getDescricao() + " PRECO: " + sB1.getCusto());
        System.out.println(sB2.getDescricao() + " PRECO: " + sB2.getCusto());
        System.out.println(sC1.getDescricao() + " PRECO: " + sC1.getCusto());
        System.out.println(sC2.getDescricao() + " PRECO: " + sC2.getCusto());
    */
}
