package codeclan.com.wordcounter;

import org.junit.Before;
import org.junit.Test;

import codeclan.com.wordcounter.models.WordCount;

import static junit.framework.Assert.assertEquals;

/**
 * Created by yanren on 13/11/2017.
 */

public class WordCountTest {
    String sentence;
    WordCount wordCount;

    @Before
    public void before() {
        this.sentence = "I'm a student.";
        this.wordCount = new WordCount(sentence);
    }

    @Test
    public void canCountWords() {

        assertEquals(3,  wordCount.countWords());
    }



}
