package com;

public class Persona extends Thread{
    
    private Cestino cestino;
    private int monete;

    public void run(){
        for(int i=0; i<monete; i++){
            cestino.aggiungiNonete();
        }
    }

    public Persona(Cestino cestino, int monete){
        this.cestino = cestino;
        this.monete = monete;
    }

}
