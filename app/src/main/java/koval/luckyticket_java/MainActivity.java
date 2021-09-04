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


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String digits = number.getText().toString();

                if (digits.length() == maxLength) {
                    int in_0 = Integer.parseInt(digits.substring(0, 1));
                    int in_1 = Integer.parseInt(digits.substring(1, 2));
                    int in_2 = Integer.parseInt(digits.substring(2, 3));
                    int in_3 = Integer.parseInt(digits.substring(3, 4));
                    int in_4 = Integer.parseInt(digits.substring(4, 5));
                    int in_5 = Integer.parseInt(digits.substring(5, 6));

                    int sum_a = in_0 + in_1 + in_2;
                    int sum_b = in_3 + in_4 + in_5;

                    if (sum_a == sum_b) {
                        Toast.makeText(getApplicationContext(), "YOU LUCKY", Toast.LENGTH_LONG).show();
                        bubl.setImageResource(R.drawable.bubl_green);
                    } else {
                        Toast.makeText(getApplicationContext(), "YOU LOSE", Toast.LENGTH_LONG).show();
                        bubl.setImageResource(R.drawable.bubl_red);
                    }

                } else {
                    Toast.makeText(MainActivity.this, "Enter 6 digits", Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}