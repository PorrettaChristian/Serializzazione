/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione1;

import java.io.Serializable;

/**
 *
 * @author porretta.christian
 */
public class studente implements Serializable {
    private String nome , cognome;
    private int num;

    public studente(String nome, String cognome, int num) {
        this.nome = nome;
        this.cognome = cognome;
        this.num = num;
    }

    @Override
    public String toString() {
        return "studente-> " + "nome: " + nome + " cognome: " + cognome + " num: " + num;
    }  
}
