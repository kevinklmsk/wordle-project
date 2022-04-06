/**
* Guesser klass kontrollib, kas pakutud sõna võrdub arvatava sõnaga.
 */
public class Guesser {
    private String wordToGuess;

    public Guesser(String wordToGuess) {
        this.wordToGuess = wordToGuess;
    }

    public StringBuilder guess(String input) {
        StringBuilder result = new StringBuilder("-----");
        for (int i = 0; i < wordToGuess.length(); i++) {
            for (int j = 0; j < wordToGuess.length(); j++) {
                if (input.charAt(i) == wordToGuess.charAt(i)) {
                    result.setCharAt(i, input.charAt(i));
                    break;
                }
                if (input.charAt(i) == wordToGuess.charAt(j)) {
                    result.setCharAt(i, Character.toLowerCase(input.charAt(i)));
                    break;
                }
            }
        }
        return result;
    }

    public String getWordToGuess() {
        return wordToGuess;
    }

}
