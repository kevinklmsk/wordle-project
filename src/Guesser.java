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
        char[] output = {'-', '-', '-', '-', '-'};

        if (input.equals(wordToGuess))
            System.out.println(wordToGuess);
        else {
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == input.charAt(i))
                    output[i] = input.charAt(i);
                else if (wordToGuess.contains(Character.toString(input.charAt(i))))
                    output[i] = Character.toLowerCase(input.charAt(i));

                }
            }
        guessCount++;

        return String.valueOf(output);
    }

    public String getWordToGuess() {
        return wordToGuess;
    }

    public int getGuessCount() {
        return guessCount;
    }
}
