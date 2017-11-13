package codeclan.com.wordcounter.models;

import java.util.ArrayList;

/**
 * Created by yanren on 13/11/2017.
 */

public class WordCount {

    private String sentence;

    public WordCount(String sentence) {
        this.sentence = sentence;
    }

//    public String[] splitSentence() {
//        return this.sentence.trim().split("\\s+");
//    }

    public int countWords() {
        return this.sentence.trim().split("\\s+").length;
    }
}
