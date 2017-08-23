
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if (guessedLetters.contains(letter)) {
            
        } else {
            if (!this.word.contains(letter)) {
                this.numberOfFaults++;
                this.guessedLetters += letter;
            } else {
                this.guessedLetters += letter;
            }
        }
        
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        int num = this.word.length();
        String hidden = "";
        
        
        for (int i = 0 ; i < num; i++) {
            String s = "" + this.word.charAt(i);
            if (this.guessedLetters.contains(s)) {
                hidden += this.word.charAt(i);
            } else {
                hidden += "_";
            }
        }
        
        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 

        // return the hidden word at the end
        return hidden;
    }
}
