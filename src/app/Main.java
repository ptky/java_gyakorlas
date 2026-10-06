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
        int etterem_beker = bekeres("Add meg a menű számát (1,2,3):");
        etterem(etterem_beker, true);
        int parkolas_beker = bekeres("Add meg a parkolási órák számát:");
        parkolodij(parkolas_beker);
        int atm_beker = bekeres("Mennyi pénzt szeretne felvenni? Adja meg:");
        atm(atm_beker,8000);
    }

    public static int bekeres(String kerdes) {

        Scanner scr = new Scanner(System.in);
        System.out.println(kerdes);

        int szam = scr.nextInt();
        return szam;

    }

    public static void vizsgaEredmeny(int szam) {
        if (szam <= 39) {
            szoveg = "0 - 39% elégtelen";
        } else if (szam <= 50) {
            szoveg = "40 - 50% elégséges";
        } else if (szam <= 65) {
            szoveg = "51 – 66% közepes";
        } else if (szam <= 84) {
            szoveg = "65 – 84%	jó";
        } else if (szam <= 100) {
            szoveg = "85 - 100% Jeles";
            if (szam == 100) {
                szoveg += " Gratulálunk!";
            }
        } else {
            szoveg = "Helytelen érték";

        }
        System.out.println("A százalékod jegyben kifejezve: " + szoveg);
    }

    public static void homerseklet(int szam) {
        szoveg = "";
        if (szam == 0) {
            szoveg = "Pontosan 0 fok van";
        } else if (szam < 0) {
            szoveg = "Fagy";
        } else if (szam <= 7) {
            szoveg = "Hideg";
        } else if (szam <= 15) {
            szoveg = "Kellemes";
        } else if (szam <= 25) {
            szoveg = "Meleg";
        } else if (szam > 25) {
            szoveg = "Forró";
        } else {
            szoveg = "Helytelen érték";

        }
        System.out.println("Időjárás a fok alapján: " + szoveg);

    }

    public static void mozijegy(int szam, boolean diakigazolvany) {
        szoveg = "";
        if (szam <= 5) {
            szoveg = "Ingyenes";
        } else if (szam <= 13) {
            szoveg = "Gyerek jegy - 1200ft";
        } else if (szam <= 17) {
            szoveg = "Diák - 1600ft";
            if (diakigazolvany) {
                szoveg = "Diák - 1280ft, 20% kedvezménnyel";
            }
        } else if (szam > 18) {
            szoveg = "Felnőtt - 2200ft";
        } else {
            szoveg = "Helytelen érték";

        }
        System.out.println("A mozijegy ára kor alapján: " + szoveg);

    }

    public static void etterem(int szam, boolean kupon) {
        szoveg = "";
        if (szam < 1 || szam > 3) {
            System.out.println("Helytelen szám.");
            int etterem_beker = bekeres("Add meg a menű számát (1,2,3):");
            etterem(etterem_beker, kupon);
        } else {
            if (szam == 1) {
                szoveg = "1. Hamburger menü, ára 2200 Ft";
                if (kupon) {
                    szoveg = "1. Hamburger menü, ára 2000 Ft kuponnal";
                }
            } else if (szam == 2) {
                szoveg = "2. Pizza menü, ára 2500 Ft";
                if (kupon) {
                    szoveg = "2. Pizza menü, ára 2250 Ft kuponnal";
                }
            } else if (szam == 3) {
                szoveg = "3. Saláta menü, ára 1800 Ft";
                if (kupon) {
                    szoveg = "3. Saláta menü, ára 1620 Ft kuponnal";
                }

            }
            System.out.println("A menüd: " + szoveg);

        }

    }

    public static void parkolodij(int szam) {
        szoveg = "";
        if (szam > 5 || szam <= 0) {
            System.out.println("Érvénytelen parkolási idő");
        } else {
            if (szam == 1) {
                szoveg = "500ft";
            } else if (szam == 2) {
                szoveg = "900ft";
            } else if (szam == 3) {
                szoveg = "1300ft";
            } else if (szam > 3) {
                szoveg = "1500ft";
            }
            System.out.println("A parkolási díjad: " + szoveg);
        }

    }
    
   public static void atm(int szam, int fedezet) {
        szoveg = "";
        if (szam < 0) {
            szoveg = "Szegény vagy mint a templom egere:) " + szam+"Ft";
        }
        else if (szam > fedezet ){
            szoveg = "Nincs elég fedezeted! Elérhető egyenleg: "+fedezet+"Ft";
        }
        else if (szam % 1000 != 0)  {
           szoveg = ("Az összeg nem osztható 1000-el.");
        } 
        else {
            szoveg = "Sikeres felvétel! Maradék összeg:"+(fedezet-szam)+"Ft";
        }
        System.out.println(szoveg);
        
        
    }

}
