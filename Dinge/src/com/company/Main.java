package com.company;

public class Main {

    public static void main(String[] args) {
        Hose<Taschentuch, Portemonnaie> hose = new Hose<>();
        hose.inDieLinkeTaschePacken(new Taschentuch());
        System.out.println(hose); // links: Taschentuch, rechts: leer

        //System.out.println(hose.GetT());

        //System.out.println(hose.GetP());
        //System.out.println(hose.GetT());
        
        hose.inDieRechteTaschePacken(new Portemonnaie());
        System.out.println(hose.GetP());
        System.out.println(hose.GetT());        
        

        // kompiliert nicht
        //hose.inDieRechteTaschePacken(new Taschentuch());
    }
}
