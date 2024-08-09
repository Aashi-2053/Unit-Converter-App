package com.example.unit_conv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView2);
        editText = findViewById(R.id.editTextNumber);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(MainActivity.this, "hii", Toast.LENGTH_SHORT).show();//neeche ata h noti type
                String s = editText.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = 2.205 * kg;
                textView.setText("The value in pound is " + pound);//
                Toast.makeText(MainActivity.this, "Thanks for using!!<3", Toast.LENGTH_SHORT).show();

            }
        });
    }
        /*public void calculate(View view)
        {String s = editText.getText().toString();
            int kg=Integer.parseInt(s);
            double pound=2.205*kg;
            textView.setText("The value in pound is "+pound);//


    }
    use it and goto attributes
    button
    serach on click -> calculate
    */
}