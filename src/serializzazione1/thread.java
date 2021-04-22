/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author porretta.christian
 */
public class thread implements Runnable{
    
    
    @Override
    public void run() {
        
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(thread.class.getName()).log(Level.SEVERE, null, ex);
            }
            studente s = new studente(this.getNome(),this.getCognome(),this.getNum());
            System.out.println(s.toString());
        }
    }
    public int getNum(){
        int num = ((int) (Math.random()*30));
        return num;
    }
    public String getNome(){
        String [] nomi = {"giacomo","lorenzo","paolo"};
        return nomi[(int) (Math.random()*nomi.length)];
    }
    public String getCognome(){
        String [] cognomi = {"bianchi","rossi","verdi"};
        return cognomi[(int) (Math.random()*cognomi.length)];
    }
}
