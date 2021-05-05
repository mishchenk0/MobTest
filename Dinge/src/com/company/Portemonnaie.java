package com.company;

public class Portemonnaie extends Tasche<Object>{
    public String P;

    public Portemonnaie() {
    	this.P = "Portemonnaie";
    	super(P);
        
    }
    
    public String get() {
    	return this.P;
    }
}
