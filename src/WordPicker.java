import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Valib sõnad.txt failist juhuslikult arvatava sõna.
 */
public class WordPicker {
    // loeb sõnad teksti failist
    public static List<String> loeSõnad(String failinimi) throws Exception {
        List<String> sõnad = new ArrayList<>();
        File file = new File(failinimi);
        try (Scanner s = new Scanner(file, "UTF-8")) {
            while (s.hasNextLine()) {
                String rida = s.nextLine();
                sõnad.add(rida);
            }
        }
        return sõnad;
    }

    // tagastab juhusliku sõna
    public static String returnWord(List<String> Sõnad) {
        int randomNum = ThreadLocalRandom.current().nextInt(0, Sõnad.size());
        String sõna = Sõnad.get(randomNum).toUpperCase();
        return sõna;
    }
}
