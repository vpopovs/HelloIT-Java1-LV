package lesson6;

public class Practicum {

    /**
     * Dots vārds ar pāra burtu skaitu. Izvadīt uz ekrāna pirmo vārda pusi.
     * @param word vārds, kura pusi ir nepieciešams atrast
     */
    public static void half(String word) {

    }

    /**
     * Doti divi vārdi. Savienot divus vārdus, izdzēšot no katra pirmo burtu. Izvadīt rezultātu uz ekrānu.
     * @param a pirmais vārds
     * @param b otrais vārds
     */
    public static void concatenation(String a, String b) {

    }

    /**
     * Ir dots vārds. Izvadīt uz ekrānu jaunu vārdu, kas sastāv no sākotnējā vārda pēdējo divu burtu trīm kopijām. 
     * @param str sākotnējais vārds
     */
    public static void extraEnd(String str) {

    }

    /**
     * Ir dots vārds. Izvadīt uz ekrānu jaunu vārdu, kurā ir dubultots katrs sākotnējā vārda burts. 
     * @param str sākotnējais vārds
     */
    public static void doubleChar(String str) {

    }

    /**
     * Ir dota rinda. Izvadīt uz ekrānu, cik reizes tajā atkārtojas vārds hi.
     * @param str rinda
     */
    public static void countHi(String str) {

    }

    public static void main(String[] args) {

        half("calendar");   // cale
        half("champion");   // cham
        half("umbrella");   // umbr

        System.out.println("----------");

        concatenation("thank", "you");  // hankou
        concatenation("come", "back");  // omeack
        concatenation("just", "dance"); // ustance

        System.out.println("----------");

        extraEnd("gold");   // ldldld
        extraEnd("music");  // icicic
        extraEnd("morning");// ngngng

        System.out.println("----------");

        doubleChar("house");    // hhoouussee
        doubleChar("spoon");    // ssppoooonn
        doubleChar("space");    // ssppaaccee

        System.out.println("----------");

        countHi("hiaaHi");      // 2
        countHi("hihilalaHIa"); // 3
        countHi("ololo");       // 0
    }
}