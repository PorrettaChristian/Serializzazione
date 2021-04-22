/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author porretta.christian
 */
public class Serializzazione1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        studente [] lista = {new studente("paolo","rossi",1),new studente("posaman","biachi",12),new studente("solillo","verde",123)};
//        studente s = new studente("paolo","rossi",123);
//        try {
//            FileOutputStream FO = new FileOutputStream("test.ser");
//            ObjectOutputStream OS = new ObjectOutputStream(FO);
////            OS.writeObject(9);
////            OS.writeObject("ciao");
////            OS.writeObject((float)0.123); 
//
//            OS.writeObject(lista);
//            OS.writeObject(false);
//            OS.writeObject('a');
//            
//            
//            OS.flush();
//            OS.close();
//            FO.close();
//
//            FileInputStream fi = new FileInputStream("test.ser");
//            ObjectInputStream is = new ObjectInputStream(fi); 
//            studente [] v1 = (studente []) is.readObject();
//            for (studente ss : v1){
//               System.out.println(ss.toString()); 
//            }
            Thread t = new Thread(new thread());
            t.start();
            
//            String v2 = (String) is.readObject();
//            System.out.println(v2);
//            float v3 =  (float) is.readObject();
//            System.out.println(v3);
            
            
//        } catch (FileNotFoundException ex) {
//            System.out.println("inpossibile trovare il file");
//        } catch (IOException ex) {
//            System.out.println("hai rotto java");
//        } 
//        catch (ClassNotFoundException ex) {
//            Logger.getLogger(Serializzazione1.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }
    
}
