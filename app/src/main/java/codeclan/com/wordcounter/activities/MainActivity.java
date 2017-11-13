package codeclan.com.wordcounter.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import codeclan.com.wordcounter.R;
import codeclan.com.wordcounter.models.WordCount;

public class MainActivity extends AppCompatActivity {

    private TextView startingPint;
    private TextView resultBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.startingPint = (TextView) findViewById(R.id.starting_point);
        this.resultBox = (TextView) findViewById(R.id.result_box);
        Log.d(getClass().toString(), "onCreate called" );
    }

    public void onClickButton(View view) {
        Log.d(getClass().toString(), "wordCount called");
        String sentence = this.startingPint.getText().toString();
        Log.d(getClass().toString(),"sentence returned");
        WordCount newSentence = new WordCount(sentence);
        int result = newSentence.countWords();
        this.resultBox.setText(Integer.toString(result));
    }
}
