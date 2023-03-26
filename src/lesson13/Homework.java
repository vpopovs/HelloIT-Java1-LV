package lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework {

    /**
     * Apstrādāt izņēmumu (NullPointerException), kas rodas, kad mēs mēģinām
     * veikt kādu darbību ar rindu, kura neeksistē (null).
     * Izvadīt paziņojumu "Vārds neeksistē".
     * @param word vārds
     */
    public static void existence(String word) {
        System.out.println(word.substring(0, word.length() / 2));
    }

    /**
     * Apstrādāt izņēmumu (StringIndexOutOfBoundsException), kas rodas, mēģinot vērsties pie rindas simbola, 
     * kurš neeksistē. Izvadīt paziņojumu "Simbols ar indeksu index neeksistē."
     * @param word vārds
     * @param index simbola indekss
     */
    public static void letterIndex(String word, int index) {
        System.out.println(word.charAt(index));
    }

    /**
     * Uzrakstīt metodi, kas meklē cilvēku datubāzē people pēc vārda personName.
     * Ja cilvēka ar tādu vārdu nav, izmest izņēmumu (throw new Exception()),
     * ja ir - izvadīt konsolē cilvēka indeksu.
     * main metodē apstrādāt izņēmumu un izvadīt paziņojumu "Tāds cilvēks neeksistē".
     * @param people cilvēku datubāze (vārdi)
     * @param personName cilvēka vārds, kas jāatrod
     */
    public static void findInDB(List<String> people, String personName) {

    }

    public static void main(String[] args) {
        existence(null);
        letterIndex("Hello", 10);
        findInDB(new ArrayList<>(Arrays.asList("Bob", "John", "Andy")), "Alan");
    }
}
