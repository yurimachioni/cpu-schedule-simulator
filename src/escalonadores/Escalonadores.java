/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package escalonadores;

import TelasUI.Tela;
import javax.swing.*;

/**
 *
 * @author lumni
 */
public class Escalonadores {

    public static void main(String[] args) {
        try {
            // Set System L&F
            UIManager.setLookAndFeel(
                UIManager.getSystemLookAndFeelClassName());
        } 
        catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
           // handle exception
        }

        
        Tela t = new Tela();
        t.setVisible(true);
        t.setTitle("Escalonador");
    }
    
}
