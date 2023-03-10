package br.com.tecknohjen.personcounter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;
import br.com.tecknohjen.personcounter.databinding.ActivityMainBinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int manCount = 0;
    private int womanCount = 0;
    private int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

        TextView totalTextView = (TextView) findViewById(R.id.total);
        Button resetButton = (Button) findViewById(R.id.reset_button);
        Button addManButton = (Button) findViewById(R.id.add_man_button);
        Button addWomanButton = (Button) findViewById(R.id.add_woman_button);

        addManButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manCount++;
                addManButton.setText(Integer.toString(manCount));
                total++;
                totalTextView.setText(Integer.toString(total));
            }
        });

        addWomanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                womanCount++;
                addWomanButton.setText(Integer.toString(womanCount));
                total++;
                totalTextView.setText(Integer.toString(total));
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manCount = 0;
                womanCount = 0;
                total = 0;
                totalTextView.setText("0");
                addWomanButton.setText("0");
                addManButton.setText("0");
            }
        });
    }
}