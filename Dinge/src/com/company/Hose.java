package com.company;

public class Hose<Tasche1, Tasche2> {

    private Tasche<Tasche1> Rechts;
    private Tasche<Tasche2> Links;

    //public Hose() { }

    public Tasche<Tasche1> GetT() { return Rechts; }
    public Tasche<Tasche2> GetP() { return Links; }

    public void inDieLinkeTaschePacken(Object x) {
        this.Links = new Tasche<>(x);
    }

   public void inDieRechteTaschePacken(Object x) {
        this.Rechts = new Tasche<>(x);
    }

}
