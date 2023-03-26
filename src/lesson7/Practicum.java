package lesson7;

public class Practicum {

    /**
     * Izvadīt uz ekrānu, cik reizes masīvā atkārtojas pāra skaitļi.
     * @param array masīvs
     */
    public static void countEvens(int[] array) {

    }

    /**
     * Izvadīt uz ekrānu true, ja masīvā nav divnieku vai nav piecinieku, ja citādi - false.
     * @param array masīvs
     */
    public static void no25(int[] array) {

    }

    /**
     * Izvadīt uz ekrānu starpību starp lielāko un mazāko masīva skaitli. 
     * @param array masīvs
     */
    public static void largestSmallestDiff(int[] array) {

    }

    /**
     * Izvadīt uz ekrānu true, ja masīvā ir vieninieks blakus vieniniekam vai divnieks blakus divniekam, bet ne abus gadījumus.
     * @param array masīvs
     */
    public static void either12(int[] array) {

    }

    /**
     * Izvadīt uz ekrānu tos pašu skaitļus, kā masīvā, bet no sākuma visus pāra skaitļus, un pēc tam nepāra.
     * @param array masīvs
     */
    public static void evenOdd(int[] array) {

    }

    public static void main(String[] args) {

        countEvens(new int[]{1, 5, 22, 4});     // 2
        countEvens(new int[]{6, 8, 3, 3, 1});   // 2
        countEvens(new int[]{1});               // 0

        System.out.println("----------");

        no25(new int[]{2, 7, 9});       // true
        no25(new int[]{8, 2, 6, 3, 5}); // false
        no25(new int[]{4, 8, 5});       // true

        System.out.println("----------");

        largestSmallestDiff(new int[]{5, 8, 2, -5});    // 13
        largestSmallestDiff(new int[]{1, 7, 3, -1});    // 8
        largestSmallestDiff(new int[]{4, 3, 5, 5});     // 2

        System.out.println("----------");

        either12(new int[]{1, 1, 6});   // true
        either12(new int[]{6, 2, 2});   // true
        either12(new int[]{1, 1, 2, 2});// false

        System.out.println("----------");

        evenOdd(new int[]{2, 3, 5, 4});     // 2 4 3 5
        evenOdd(new int[]{1, 1, 7, 8, 3});  // 8 1 1 7 3
        evenOdd(new int[]{7, 6, 3, 1});     // 6 7 3 1

    }

}