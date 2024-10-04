package com;

public class Cestino {
    
    public int contatore;

    public int getContatore(){
        return contatore;
    }

    public Cestino(int contatore){
        this.contatore = contatore;
    }

    synchronized public void aggiungiNonete(){
        contatore = contatore + 1;
    }
}
