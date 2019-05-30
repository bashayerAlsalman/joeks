package net.bashayer.androidlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    public static final String KEY = "joke";

    private TextView jokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        jokeTextView = findViewById(R.id.joke);
        String joke = getIntent().getStringExtra(KEY);
        jokeTextView.setText(joke);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
