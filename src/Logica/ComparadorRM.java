/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logica;

import java.util.Comparator;

/**
 *
 * @author jess
 */
public class ComparadorRM implements Comparator<Processo> {
       
    @Override
	public int compare(Processo p1, Processo p2) {
        
        if (p1.getPeriodo() < p2.getPeriodo()) {
            return -1;
        }
        if (p1.getPeriodo() > p2.getPeriodo()) {
            return 1;
        }
        return 0;
    }
}
