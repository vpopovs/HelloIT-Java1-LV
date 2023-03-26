package lesson11;

import java.util.ArrayList;

public class Practicum {

    /*
    Ir dots fails ar princesēm princesses.txt (vārds, dzīves statuss, ieslodzījuma vieta, papildus informācija).
    Uzdevums ir: sakārtot princeses pēc dzīves statusa
    un ierakstīt jaunā failā tikai tās, kuras ir vērts glābt. 
     */

    /**
     * Izlasīt failu un saglabāt katras princeses datus listā. 
     * @return list ar princesēm
     */
    public static ArrayList<String[]> read() {
        return null;
    }

    /**
     * Izslēgt princeses ar nederīgo statusu: "EATEN", "SAVED", "SLAYED THE DRAGON HERSELF".
     * Tās nav vērts glābt
     * @param princesses list ar princesēm
     * @return sakārtots list ar princesēm
     */
    public static ArrayList<String[]> filterByStatus(ArrayList<String[]> princesses) {
        return null;
    }

    /**
     * Sakārtot princeses pēc statusa FIGHTS FOR LIFE > INJURED > IN PANIC > BORED.
     * FIGHTS FOR LIFE it pirms INJURED u.t.t.
     * @param filteredPrincesses sakārtots list ar princesēm
     * @return sakārtots list ar princesēm
     */
    public static ArrayList<String[]> sortByStatus(ArrayList<String[]> filteredPrincesses) {
        return null;
    }

    /**
     * Ierakstīt princeses jaunajā failā 'princesses_to_save.txt' formātā:
     *  Vārds
     *  Statuss
     *  Ieslodzījuma vieta
     *  Papildus informācija
     *  <Tukša rinda>
     */
    public static void write(String fileToWriteName) {

    }

    public static void main(String[] args) {
        write("result.txt");
    }

}