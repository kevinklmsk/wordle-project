import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws Exception{
        List<String> Sõnad = loeSõnad("sõnad.txt");
        int randomNum = ThreadLocalRandom.current().nextInt(0, Sõnad.size());
        String sõna = Sõnad.get(randomNum).toUpperCase();
        System.out.println(sõna);
        Guesser word = new Guesser(sõna);
        String guessResult = "";

        while (!guessResult.equals(word.getWordToGuess())) {
            guessResult = word.guess();
            System.out.println(guessResult);
            if (word.getGuessCount() == 6) {
                System.out.println("Fail");
                break;
            }
        }
    }


    public static List<String> loeSõnad(String failinimi) throws Exception{
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
}
