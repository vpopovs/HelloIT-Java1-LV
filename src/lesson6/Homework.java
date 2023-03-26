package lesson6;

public class Homework {

    /**
     * Dots divas rindas. Izvadīt uz ekrānu jaunu rindu, kurai ir garā rinda + īsā rinda + garā rinda forma.
     * Rindas ir dažāda garuma.
     * @param a pirmā rinda
     * @param b otrā rinda
     */
    public static void comboString(String a, String b) {

    }

    /**
     * Ir dota rinda. Izvadīt uz ekrānu jaunu rindu, kurā pēdējie divi burti no sākotnējās rindas stāv sākumā.
     * Sākotnējā rindā min 2 simboli.
     * @param str sākotnējā rinda
     */
    public static void toStart2(String str) {

    }

    /**
     * Ir dota rinda. Izvadīt uz ekrānu jaunu rindu, kura ir sākotnējās rindas variācija, bet bez pirmā un pēdējā burtiem. 
     * Sākotnējās rindas garums var būt 0.
     * @param str Sākotnējā rinda
     */
    public static void withoutStartEnd(String str) {

    }

    /**
     * Ir dota rinda. Izvadīt uz ekrānu true, ja vārds car un bus ir rindā vienādā daudzumā. Ja citādi - false.
     * @param str rinda
     */
    public static void carBus(String str) {

    }

    /**
     * Dota sākotnējā rinda str un skaitlis n.
     * Izvadīt uz ekrānu rindu, kura sastāv no rindas str pēdējiem n simboliem, kuri atkārtojas n reizes.
     * @param str sākotnējā rinda.
     * @param n rindas pēdējo simbolu skaits, ko vajag atkārtot tik pat reizes
     */
    public static void repeatEnd(String str, int n) {

    }

    public static void main(String[] args) {

        comboString("aaaaa", "bbb");    // aaaaabbbaaaaa
        comboString("Hi", "hello");     // helloHihello
        comboString("KKKKK", "L");      // KKKKKLKKKKK

        System.out.println("----------");

        toStart2("world");  // ldwor
        toStart2("test");   // stte
        toStart2("go");     // go

        System.out.println("----------");

        withoutStartEnd("system");  // yste
        withoutStartEnd("person");  // erso
        withoutStartEnd("");        //

        System.out.println("----------");

        carBus("carbuscar"); // false
        carBus("car4589bus");   // true
        carBus("djwejd123");    // true

        System.out.println("----------");

        repeatEnd("memory", 3); // oryoryory
        repeatEnd("minute", 2); // tete
        repeatEnd("sound", 1);  // d

    }

}
