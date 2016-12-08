/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import control.ClienteControl;
import model.beam.Cliente;
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
}
