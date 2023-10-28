package lesson08;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework {

    /**
     * Izvadīt uz ekrānu lapas elementu summu ar nepāra indeksiem.
     * @param list lapa
     */
    public static void oddIndexSum(ArrayList<Integer> list) {
        // Šeit jābūt programmas kodam
    }

    /**
     * Samainīt pirmo un otro lapas pusi ar vietām.
     * Elementu skaits lapā ir pāra. 
     * @param list lapa
     */
    public static void changeOrder(ArrayList<Integer> list) {
        // Šeit jābūt programmas kodam
    }

    /**
     * Izvadīt lapas elementus sekojosā secībā: pirmais, pēdējais, otrais, priekšpēdējais u.t.t.
     * Elementu skaits lapā ir pāra. 
     * @param list lapa
     */
    public static void shuffle(ArrayList<Integer> list) {
        // Šeit jābūt programmas kodam
    }

    /**
     * Atrast un izvadīt uz ekrānu visu lapas elementu summu, izņemot maksimālo un minimālo skaitli. 
     * @param list lapa
     */
    public static void sumWithoutMaxMin(ArrayList<Integer> list) {
        // Šeit jābūt programmas kodam
    }

    /**
     * Izvadīt uz ekrānu true, ja skaitļi lapā stāv augošā secībā, citādi - false.
     * @param list lapa
     */
    public static void ascOrder(ArrayList<Integer> list) {
        // Šeit jābūt programmas kodam
    }

    public static void main(String[] args) {

        oddIndexSum(new ArrayList<>(Arrays.asList(1, 6, 8, 4, 44))); // 10
        oddIndexSum(new ArrayList<>(Arrays.asList(9, 9, 5, 0)));     // 9
        oddIndexSum(new ArrayList<>(Arrays.asList(1, 55, 4, 2)));    // 57

        System.out.println("----------");

        changeOrder(new ArrayList<>(Arrays.asList(6, 8, 3, 1, 7, 5)));  // [1, 7, 5, 6, 8, 3]
        changeOrder(new ArrayList<>(Arrays.asList(1, 2, 5, 7)));        // [5, 7, 1, 2]
        changeOrder(new ArrayList<>(Arrays.asList(4, 4, 4, 4)));        // [4, 4, 4, 4]

        System.out.println("----------");

        shuffle(new ArrayList<>(Arrays.asList(5, 4, 2, 7)));        // 5 7 4 2
        shuffle(new ArrayList<>(Arrays.asList(1, 2)));              // 1 2
        shuffle(new ArrayList<>(Arrays.asList(5, 7, 3, 7, 0, 0)));  // 5 0 7 0 3 7

        System.out.println("----------");

        sumWithoutMaxMin(new ArrayList<>(Arrays.asList(5, 8, 3, 2)));       // 8
        sumWithoutMaxMin(new ArrayList<>(Arrays.asList(1, 5, 8, 34, 2)));   // 15
        sumWithoutMaxMin(new ArrayList<>(Arrays.asList(90, 0, 100 , 3)));   // 93

        System.out.println("----------");

        ascOrder(new ArrayList<>(Arrays.asList(1, 5, 8, 9)));   // true
        ascOrder(new ArrayList<>(Arrays.asList(6, 6, 10, 15))); // false
        ascOrder(new ArrayList<>(Arrays.asList(1, 6, -2, 6)));  // false

    }

}
