package lesson13;

public class Practicum {

    /**
     * Apstrādāt izņēmumu (ArithmeticException), kas rodas, dalot ar 0
     * un izvadīt paziņojumu "Dalīt ar 0 nevar".
     * @param a dalāmais
     * @param b dalītājs
     */
    public static void division(int a, int b) {
        System.out.println(a/b);
    }

    /**
     * Apstrādāt izņēmumu (ArrayIndexOutOfBoundsException), kas rodas, mēģinot vērsties pie masīva elementa,
     * kurš neeksistē. Izvadīt paziņojumu "Elements ar indeksu index neeksistē".
     * @param array masīvs
     * @param index elementa indekss
     */
    public static void elementIndex(int[] array, int index) {
        System.out.println(array[index]);
    }

    /**
     * Uzrakstīt metodi, kas pārbauda lietotāja vecumu pirms ienākšanas mājaslapā.
     * Ja vecums ir mazāks par 18, izmest izņēmumu (throw new Exception()),
     * ja vairāk - izvadīt paziņojumu "Ieeja ir veikta".
     * main metodē apstrādāt izņēmumu un izvadīt paziņojumu "Ieeja aizliegta".
     * @param age vecums
     */
    public static void access(int age) {
    }

    public static void main(String[] args) {
        division(5, 0);
        elementIndex(new int[]{1, 3, 6}, 5);
        access(17);
    }

}
