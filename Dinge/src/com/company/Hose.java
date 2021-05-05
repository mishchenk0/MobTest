package com.company;

public class Hose<L, R> {

    public Tasche Rechts;
    public Tasche Links;

    //public Hose() { }

    public void inDieLinkeTaschePacken(L x) {
        this.Links = new Tasche(x);
    }

    public void inDieRechteTaschePacken(R x) {
        this.Rechts = new Tasche(x);
    }



}
