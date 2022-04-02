public class Main {
    public static void main(String[] args) {
        Guesser word = new Guesser("NAINE");
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
}
