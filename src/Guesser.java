import java.util.Scanner;

public class Guesser {
    private String wordToGuess;
    private int guessCount;

    public Guesser(String wordToGuess) {
        this.wordToGuess = wordToGuess;
    }

    public String guess() {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        char[] result = {'-','-','-','-','-'};

        if (input.equals(wordToGuess))
            result = wordToGuess.toCharArray();
        else {
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.contains(Character.toString(input.charAt(i)))) {
                    int wordToGuessCount = wordToGuess.length() - wordToGuess.replaceAll(Character.toString(input.charAt(i)),"").length();
                    int inputCount = input.length() - input.replaceAll(Character.toString(input.charAt(i)),"").length();
                    if (wordToGuess.charAt(i) == input.charAt(i))
                        result[i] = input.charAt(i);
                    else if (wordToGuess.contains(Character.toString(input.charAt(i))) &&
                        wordToGuessCount - inputCount >= 0)
                        result[i] = Character.toLowerCase(input.charAt(i));
                }
            }
        }
        guessCount++;

        return String.valueOf(result);
    }

    public String getWordToGuess() {
        return wordToGuess;
    }

    public int getGuessCount() {
        return guessCount;
    }

}
