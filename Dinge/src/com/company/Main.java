package com.company;

public class Main {

    public static void main(String[] args) {
        Hose<Taschentuch, Portemonnaie> hose = new Hose<>();
        hose.inDieLinkeTaschePacken(new Taschentuch());
        System.out.println(hose); // links: Taschentuch, rechts: leer

        System.out.println(hose.GetT());

        System.out.println(hose.GetP());

        Hose<Portemonnaie, Taschentuch> hose1 = new Hose<>();
        hose1.inDieLinkeTaschePacken(new Taschentuch());

        System.out.println(hose1); // links: Taschentuch, rechts: leer

        System.out.println(hose1.GetT());

        System.out.println(hose1.GetP());

        // kompiliert nicht
        //hose.inDieRechteTaschePacken(new Taschentuch());
    }
}
