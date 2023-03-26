package lesson8;

import java.util.ArrayList;
import java.util.Arrays;

public class Practicum {

    /**
     * Atrast lapā list skaitli num, izdzēst to un izvadīt jaunu lapu uz ekrānu. 
     * Ja skaitlis netika atrasts, izvadīt uz ekrānu attiecīgo paziņojumu. 
     * @param list lapa
     * @param num skaitlis, kas jāatrod
     */
    public static void findRemove(ArrayList<Integer> list, int num) {

    }

    /**
     * Izvadīt uz ekrānu true, ja lapa ir simetriskā. Citādi - false.
     * @param list saraksts
     */
    public static void symmetric(ArrayList<Integer> list) {

    }

    /**
     * Izvadīt uz ekrānu, cik dažādu skaitļu ir lapā. 
     * @param list lapa
     */
    public static void diffNums(ArrayList<Integer> list) {

    }

    /**
     * Izveidot lapu, kurā ir visas sākotnējās lapas elementi, bet no sākuma iet skaitļi, mazāki par vidējo, un tad lielāki. 
     * Izvadīt to uz ekrānu.
     * @param list sākotnējā lapa
     */
    public static void average(ArrayList<Integer> list) {

    }

    /**
     * Izveidot lapu, kurā ir visas sākotnējās lapas elementi,
     * kuri dalās vismaz ar vienu skaitli no sākotnējās lapas. 
     * Izvadīt jaunu lapu uz ekrānu.
     * Visi skaitļi ir dažādi.
     * @param list sākotnējā lapa
     */
    public static void devider(ArrayList<Integer> list) {

    }

    public static void main(String[] args) {

        findRemove(new ArrayList<>(Arrays.asList(1, 5, 7, 2)), 2);  // [1, 5, 7]
        findRemove(new ArrayList<>(Arrays.asList(3, 7, 2, 1)), 6);  // Число 6 не найдено
        findRemove(new ArrayList<>(Arrays.asList(1, 8, 5, 3)), 8);  // [1, 5, 3]

        System.out.println("----------");

        symmetric(new ArrayList<>(Arrays.asList(1, 5, 7, 8)));  // false
        symmetric(new ArrayList<>(Arrays.asList(2, 7, 9, 4)));  // false
        symmetric(new ArrayList<>(Arrays.asList(1, 2, 2, 1)));  // true

        System.out.println("----------");

        diffNums(new ArrayList<>(Arrays.asList(5, 4, 4, 1)));   // 3
        diffNums(new ArrayList<>(Arrays.asList(6, 8, 3, 1)));   // 4
        diffNums(new ArrayList<>(Arrays.asList(1, 1, 1, 1)));   // 1

        System.out.println("----------");

        average(new ArrayList<>(Arrays.asList(6, 4, 1, 8, 9, 3)));  // [4, 1, 3, 6, 8, 9]
        average(new ArrayList<>(Arrays.asList(9, 3, 7, 1, 6, 2)));  // [3, 1, 2, 9, 7, 6]
        average(new ArrayList<>(Arrays.asList(1, 5, 3, 8, 3, 2)));  // [1, 3, 3, 2, 5, 8]

        System.out.println("----------");

        devider(new ArrayList<>(Arrays.asList(2, 5, 9, 8)));        // [8]
        devider(new ArrayList<>(Arrays.asList(7, 19, 13, 8, 4)));   // [8]
        devider(new ArrayList<>(Arrays.asList(9, 71, 5, 6, 21)));   // []

    }

}
