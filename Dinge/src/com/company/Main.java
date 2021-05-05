package com.company;

public class Main {

    public static void main(String[] args) {
        Hose<Taschentuch, Portemonnaie> hose = new Hose<>();
        hose.inDieLinkeTaschePacken(new Taschentuch());
        System.out.println("Links" + hose.Links.typ); // links: Taschentuch, rechts: leer

        //System.out.println(hose.GetT());

        //System.out.println(hose.GetP());
        //System.out.println(hose.GetT());
        
        hose.inDieRechteTaschePacken(new Portemonnaie());
        

        // kompiliert nicht
        //hose.inDieRechteTaschePacken(new Taschentuch());
    }
}
