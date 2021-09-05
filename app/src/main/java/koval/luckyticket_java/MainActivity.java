package koval.luckyticket_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final int maxLength = 6;

    private EditText number;
    private Button button;
    private ImageView bubl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = findViewById(R.id.number);
        bubl = findViewById(R.id.bubl);
        button = findViewById(R.id.button);

        button.setOnClickListener(this::onClick);
    }

    public void onClick(View view) {
        String digits = number.getText().toString();

        if (digits.length() == maxLength) {
            int sum_a = Integer.parseInt(digits.substring(0, 3));
            int sum_b = Integer.parseInt(digits.substring(3, 6));

            if (sum_a == sum_b) {
                Toast.makeText(getApplicationContext(), R.string.yes, Toast.LENGTH_LONG).show();
                bubl.setImageResource(R.drawable.bubl_green);
            } else {
                Toast.makeText(getApplicationContext(), R.string.no, Toast.LENGTH_LONG).show();
                bubl.setImageResource(R.drawable.bubl_red);
            }

        } else {
            Toast.makeText(MainActivity.this, R.string.dig, Toast.LENGTH_LONG).show();

        }
    }
}

