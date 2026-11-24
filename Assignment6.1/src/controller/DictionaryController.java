package controller;

import model.Dictionary;

public class DictionaryController {

    private Dictionary dictionary;

    public DictionaryController(Dictionary dictionary) {
        this.dictionary = dictionary;

        dictionary.addWord("apple", "A sweet fruit.");
        dictionary.addWord("book", "A collection of written pages.");
        dictionary.addWord("computer", "An electronic device that processes data.");
        dictionary.addWord("java", "A programming language.");
        dictionary.addWord("school", "A place where students learn.");
        dictionary.addWord("water", "A clear liquid essential for life.");
        dictionary.addWord("sun", "The star at the center of our solar system.");
    }

    public String searchWord(String word) {

        if (word == null || word.trim().isEmpty()) {
            return "Please enter a word.";
        }

        String meaning = dictionary.searchWord(word.trim());

        if (meaning == null) {
            return "Word not found in the dictionary.";
        }

        return meaning;
    }
}