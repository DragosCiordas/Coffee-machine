package ex4;

import java.util.*;

public class Dictionary {
    private Map<Word, Definition> word;

    public Dictionary() {
        this.word = new HashMap<>();

    }

    public void addWord(Word word0, Definition definition0) {
        this.word.put(word0, definition0);
    }

    public Definition getDefinition(Word word0) {
        return this.word.get(word0);
    }


    public Set<Word> getAllWords() {
        return this.word.keySet();
    }

    public List<Definition> getAllDefinitions() {
        return new ArrayList<>(this.word.values());
    }

}
