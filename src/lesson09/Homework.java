package lesson09;

public class Homework {

    /**
     * Palūgt lietotājam ievadīt frāzi, kas sastāv no dažāda garuma vārdiem.
     * Atrast visgarāko un visīsāko vārdus un apmainīt tos ar vietām.
     * Izvadīt uz ekrānu iegūto frāzi.
     */
    public static void reverseWords() {
        // Šeit jābūt programmas kodam
    }

    /**
     * Palūgt lietotājam ievadīt teikumu.
     * Apgriezt ievadīto teikumu un izvadīt rezultātu uz ekrānu. 
     */
    public static void reversePhrase() {
        // Šeit jābūt programmas kodam
    }

    /**
     * Palūgt lietotājam ievadīt skaitli.
     * Atrast un izvadīt uz ekrānu ievadītā skaitļa ciparu summu. 
     */
    public static void numSum() {
        // Šeit jābūt programmas kodam
    }

    /**
     * Palūgt lietotājam ievadīt 5 vārdus konsolē.
     * Izvadīt uz ekrānu tos vārdus, kuru garums ir mazāks par vidējo garumu. 
     */
    public static void averageLength() {
        // Šeit jābūt programmas kodam
    }

    /**
     * Uzrakstīt mazu spēlīti, kurā lietotājam jāatmin nejauši izvēlēto skaitli. 
     * Ja skaitlis ir mazāks vai lielāks, paziņot par to lietotājam. 
     * Ja lietotājs atminēja skaitli, izvadīt uz ekrānu attiecīgo paziņojumu.
     */
    public static void guessNum() {
        int num = (int)(Math.random() * ((30 - 1) + 1)) + 1; // Nejaušs skaitlis diapazonā 1-30
        // Šeit jābūt programmas kodam
    }

    public static void main(String[] args) {

        reverseWords();

        System.out.println("----------");

        reversePhrase();

        System.out.println("----------");

        numSum();

        System.out.println("----------");

        averageLength();

        System.out.println("----------");

        guessNum();

        System.out.println("----------");

    }
}
