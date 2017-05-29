package org.aspecialkey.buildmanagement;

/**
 * Created by KK on 22.05.2017.
 *
 * Kleine Klasse zum Testen des Build-Automatisierungsprozesses mit ANT
 */
public class Buildmanagement {

    /**
     * Main-Methode als Prgrammeinstiegspunkt
     *
     * @param args übergebeneParameter beim Prgrammaufruf
     */
    public static void main(String[] args){
        System.out.println("Applikation gestartet");
    }


    /**
     * addiert zwei int-Werte
     *
     * @param a erster Summand
     * @param b zweiter Summand
     * @return Summe (von a & b)
     */
    public int add(int a, int b){
        return a + b;
    }
}

