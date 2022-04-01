public class Main {
    public static void main(String[] args) {
        Guesser word = new Guesser("NAINE");
        String guessResult = "";

        while (!guessResult.equals(word)) {
            guessResult = word.guess();
            System.out.println(guessResult);
        }
    }
}
