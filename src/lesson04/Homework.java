package lesson04;

public class Homework {

    /**
     * Doti trīs skaitļi numOne, numTwo, numThree. Izvadiet tos uz ekrāna augošā secībā.
     * Visi trīs skaitļi ir dažādi.
     * @param numOne pirmais skaitlis
     * @param numTwo otrais skaitlis
     * @param numThree trešais skaitlis
     */
    public static void ascendingOrder(int numOne, int numTwo, int numThree) {
        // Šeit jābūt programmas kodam
    }

    /**
     * Mainīgajā minute atrodas stundas minūte (0-59). Izvadīt uz ekrānu, kurā stundas ceturksnī atrodas minūte. 
     * @param minute stundas minūte
     */
    public static void quarterOfAnHour(int minute) {
        // Šeit jābūt programmas kodam
    }

    /**
     * Pārbaudīt un izvadīt uz ekrānu, vai eksistē trijstūris ar norādītām malām.
     * @param a pirmā trijstūra mala
     * @param b otrā trijstūra mala
     * @param c trešā trijstūra mala
     */
    public static void triangle(int a, int b, int c) {
        // Šeit jābūt programmas kodam
    }

    /**
     * Doti apļa rādiuss un kvadrāta malas garums.
     * Paziņot uz ekrāna, vai aplis ietilps kvadrātā. 
     * @param r apļa rādiuss
     * @param a kvadrāta malas garums
     */
    public static void circleInSquare(double r, double a) {
        // Šeit jābūt programmas kodam
    }

    public static void main(String[] args) {
        ascendingOrder(5, 1, 7);    // 1 5 7
        ascendingOrder(-2, -7, 12); // -7 -2 12
        ascendingOrder(3, 6, -6);   // -6 3 6

        System.out.println("----------");

        quarterOfAnHour(56);    // 4
        quarterOfAnHour(14);    // 1
        quarterOfAnHour(32);    // 3

        System.out.println("----------");

        triangle(3, 5, 7);  // Eksistē
        triangle(6, 8, 1);  // Neeksistē
        triangle(6, 6, 12); // Neeksistē

        System.out.println("----------");

        circleInSquare(5.3, 12);    // Ietilps
        circleInSquare(7.1, 3.3);   // Neietilps
        circleInSquare(4.4, 4.4);   // Neietilps
    }
}