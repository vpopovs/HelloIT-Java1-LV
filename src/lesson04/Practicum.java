package lesson04;

import java.util.Random;

public class Practicum {

    /**
     * Izveidot programmu, kas pārbauda un paziņo uz ekrāna,
     * vai skaitlis number ir pāra vai nepāra.
     * @param number skaitlis, kas tiek pārbaudīts uz pāra/nepāra
     */
    public static void parity(int number) {
        // Šeit jābūt programmas kodam 
    }

    /**
     * Noteikt, kāds no trīm skaitļiem - vislielākais un izvadīt to uz ekrānu.
     * Visi trīs skaitļi ir dažādi.
     * @param numberOne pirmais skaitlis
     * @param numberTwo otrais skaitlis
     * @param numberThree trešais skaitlis
     */
    public static void maxNumber(int numberOne, int numberTwo, int numberThree) {
        // Šeit jābūt programmas kodam
    }

    /**
     * Izveidot programmu, kas izvada uz ekrānu skaitlim 10 tuvāko skaitli (numberOne vai numberTwo).
     * Piemēram, starp skaitļiem 8 un 11, tuvākais skaitlim 10 – 11.
     * Skaitļi var atrasties vienādā attālumā no 10.
     * @param numberOne pirmais skaitlis
     * @param numberTwo otrais skaitlis
     */
    public static void nearestNumber(int numberOne, int numberTwo) {
        // Šeit jābūt programmas kodam
    }

    /**
     * Izveidot programmu, kas pārbaudīs, vai nejauši izvēlētais veselais skaitlis no intervāla [5;155]
     * ir iekļauts intervālā (25;100) un paziņot rezultātu uz ekrāna.
     */
    public static void randomNumber() {
        int randomNumber = new Random().nextInt((155 - 5) + 1) + 5; // Nejaušs skaitlis starp 5 un 155
        // Šeit jābūt programmas kodam
    }

    public static void main(String[] args) {

        parity(5);  // Nepāra
        parity(6);  // Pāra
        parity(57); // Nepāra

        System.out.println("----------");

        maxNumber(5, 7, 3);     // 7
        maxNumber(6, 11, 12);   // 12
        maxNumber(0, -5, 6);    // 6

        System.out.println("----------");

        nearestNumber(6, 12);   // 12
        nearestNumber(11, 11);  // Skaitļi ir vienādā attālumā no 10
        nearestNumber(3, -5);   // 3

        System.out.println("----------");

        randomNumber();
        randomNumber();
        randomNumber();
    }
}