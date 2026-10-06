/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import java.util.Scanner;

/**
 *
 * @author PatakyDániel(Szf_9ev
 */
public class Main {

    static String szoveg = "";

    public static void main(String[] args) {
        int szazalek_Beker = bekeres("Add meg a százalékot (csak szám):");
        vizsgaEredmeny(szazalek_Beker);
        int homerseklet_Beker = bekeres("Add meg a hömérsékletet (csak szám):");
        homerseklet(homerseklet_Beker);
        int mozijegy_kor = bekeres("Add meg az életkorod:");
        mozijegy(mozijegy_kor, true);
    }
    
    public static int bekeres(String kerdes) {
        
        Scanner scr = new Scanner(System.in);
        System.out.println(kerdes);
        
        int szam = scr.nextInt();
        return szam;
        
    }
    public static void vizsgaEredmeny(int szam) {
        if (szam <= 39)  {
            szoveg = "0 - 39% elégtelen";
        }
        else if (szam <= 50) {
            szoveg = "40 - 50% elégséges";
        }
        else if (szam <= 65) {
            szoveg = "51 – 66% közepes";
        }
        else if (szam <= 84) {
            szoveg = "65 – 84%	jó";
        }
        else if (szam <=100) {
            szoveg = "85 - 100% Jeles";
            if (szam == 100) {
                szoveg += " Gratulálunk!";
            }
        }
        else {
            szoveg = "Helytelen érték";
            
        }
        System.out.println("A százalékod jegyben kifejezve: "+szoveg);
    }
    
    public static void homerseklet(int szam) {
        szoveg = "";
        if (szam == 0)  {
            szoveg = "Pontosan 0 fok van";
        }
        else if (szam < 0) {
            szoveg = "Fagy";
        }     
        else if (szam <= 7) {
            szoveg = "Hideg";
        }
        else if (szam <= 15) {
            szoveg = "Kellemes";
        }
        else if (szam <= 25) {
            szoveg = "Meleg";
        }
        else if (szam > 25) {
            szoveg = "Forró";
        }
        else {
            szoveg = "Helytelen érték";
            
        }
        System.out.println("Időjárás a fok alapján: "+szoveg);
    
}
    
    public static void mozijegy(int szam, boolean diakigazolvany) {
        szoveg = "";
        if (szam <= 5)  {
            szoveg = "Ingyenes";
        }
        else if (szam <= 13) {
            szoveg = "Gyerek jegy - 1200ft";
        }     
        else if (szam <= 17) {
            szoveg = "Diák - 1600ft";
            if (diakigazolvany) {
                szoveg = "Diák - 1280ft, 20% kedvezménnyel";
            }
        }
        else if (szam > 18) {
            szoveg = "Felnőtt - 2200ft";
        }
        else {
            szoveg = "Helytelen érték";
            
        }
        System.out.println("A mozijegy ára kor alapján: "+szoveg);
    
}
    
     

}