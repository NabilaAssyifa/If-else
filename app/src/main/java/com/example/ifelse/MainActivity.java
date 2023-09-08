package com.example.ifelse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText ETumur;
    TextView Tvstatus;
    Button BTNproses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ETumur = findViewById(R.id.umur);
        Tvstatus = findViewById(R.id.status);
        BTNproses = findViewById(R.id.proses);

        BTNproses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int umur = Integer.parseInt(ETumur.getText().toString());
                if (umur > 17) {
                    Tvstatus.setText("Umur Anda termasuk dewasa");
                } else {
                    Tvstatus.setText("Umur anda tidak termasuk dewasa");
                }
            }
        });
    }
}
