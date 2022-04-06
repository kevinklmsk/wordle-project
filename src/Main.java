import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        String wordToGuess = WordPicker.returnWord(WordPicker.loeSõnad("sõnad.txt"));
        Guesser word = new Guesser(wordToGuess);
        int guessCount = 6;
        Scanner in = new Scanner(System.in);
        String guessResult = "";

        System.out.println(wordToGuess);
        while (!guessResult.equals(word.getWordToGuess()) && guessCount != 0) {
            String input = in.nextLine();
            if (input.length() != 5) {
                System.out.println("Sõna peab olema 5 täheline");
                continue;
            }
            if (!input.equals(input.toUpperCase())) {
                System.out.println("Sõna peab olema sisestatud suurtes tähtedes");
                continue;
            }
            guessResult = word.guess(input).toString();
            System.out.println(guessResult);
            guessCount--;
        }
        System.out.println("Mäng läbi");
    }
}
