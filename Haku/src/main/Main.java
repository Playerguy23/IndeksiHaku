/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author maa1k
 */
public class Main {
    private int tauluKoko = 20;
    private int[] taulu = new int[tauluKoko];
    
    public void luoTaulukko() {
        Random random = new Random();
        
        for(int i = 0; i < tauluKoko; i++) {
            int luku = random.nextInt(30 - 1) + 1;
            taulu[i] = luku;
        }
    }
    
    public void tulostaTaulukko() {
        for(int i = 0; i < tauluKoko; i++) {
            System.out.println("|" + i + " | " + taulu[i] + "|");
        }
    }
    
    public void hae(int haettava) {
        for(int i = 0; i < taulu.length; i++) {
            if(i == haettava) {
                System.out.println(taulu[i]);
            }
        }
    }
    
    public void haeLuvulla(int luku) {
        for(int i = 0; i < taulu.length; i++) {
            if(taulu[i] == luku) {
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Tervetuloa haku algoritmiin!\n");
        System.out.println("Käytä haluamaasi komentoa:\n");
        System.out.println("1: luo inkesin.");
        System.out.println("2: tulostaa indeksin.");
        System.out.println("3: hae indeksistä.");
        System.out.println("4: hae luvulla.");
        System.out.println("5: lopeta.\n");
        while(true) {
            System.out.print("Komento: ");
            
            int komento;
            try{
                komento = Integer.valueOf(lukija.nextLine());
            }catch(Exception e) {
                System.out.println("Ei ole numero!");
                continue;
            }
            
            if(komento == 1) {
                main.luoTaulukko();
            }
            
            if(komento == 2) {
                main.tulostaTaulukko();
            }
            
            if(komento == 3) {
                try {
                    System.out.print("Haettava: ");
                    int luku = Integer.valueOf(lukija.nextLine());
                    
                    main.hae(luku);
                }catch(Exception e) {
                    System.out.println("Ei ole numero.");
                }
            }
            
            if(komento == 4) {
                try{
                    System.out.print("Luku: ");
                    int luku = Integer.valueOf(lukija.nextLine());
                    
                    main.haeLuvulla(luku);
                }catch(Exception e) {
                    System.out.println("Ei ole luku.");
                }
            }
            
            if(komento == 5) {
                break;
            }
        }
        
    }
}
