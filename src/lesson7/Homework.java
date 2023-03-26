package lesson7;

public class Homework {

    /**
     * Izvadīt uz ekrānu true, ja kaut kur masīvā divi devītnieki stāv blakus. Citādi - false.
     * @param array masīvs
     */
    public static void has99(int[] array) {

    }

    /**
     * Izvadīt uz ekrānu masīva to pozitīvo skaitļu summu, kuriem seko negatīvie skaitļi. 
     * @param array masīvs
     */
    public static void sumPositive(int[] array) {

    }

    /**
     * Izveidot masīvu, kas ir apgriezts sākotnēja masīva variants un izvadīt tā elementus uz ekrānu. 
     * !sk. Cikls ar diviem mainīgajiem!
     * @param array sākotnējais masīvs
     */
    public static void reverseArray(int[] array) {

    }

    /**
     * Samainīt ar vietām maksimālo un miniālo skaitli masīvā. Izvadīt iegūtā masīva elementus uz ekrānu. 
     * @param array masīvs
     */
    public static void changeMaxMin(int[] array) {

    }

    /**
     * Izveidot jebkādu divdimensiju masīvu un izvadīt to uz konsoli tabulas veidā (sk. prezentāciju).
     */
    public static void twoDimensionalArray() {

    }

    public static void main(String[] args) {

        has99(new int[]{9, 9, 5, 1});   // true
        has99(new int[]{1, 7, 9, 1});   // false
        has99(new int[]{3, 5, 9, 9, 9});// true

        System.out.println("----------");

        sumPositive(new int[]{5, 3, 1, -5, 4});     // 1
        sumPositive(new int[]{-1, 4, -2, 5, -3});   // 9
        sumPositive(new int[]{4, 7, 5, -2, 5, -2}); // 10

        System.out.println("----------");

        reverseArray(new int[]{1, 5, 8, 4});    // 4 8 5 1
        reverseArray(new int[]{1, 1, 2});       // 2 1 1
        reverseArray(new int[]{6});             // 6

        System.out.println("----------");

        changeMaxMin(new int[]{5, 8, -1, 5});   // 5 -1 8 5
        changeMaxMin(new int[]{1, 7, 9, 3});    // 9 7 1 3
        changeMaxMin(new int[]{-2, -1, 3, 5});  // 5 -1 3 -2

        System.out.println("----------");

        twoDimensionalArray();
    }
}
