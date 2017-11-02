package id.co.north.dev.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class mainActivity extends AppCompatActivity {

    EditText inputan;
    Button cek, hapus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputan = (EditText)findViewById(R.id.inputData);
        cek = (Button)findViewById(R.id.btnShow);
        hapus = (Button)findViewById(R.id.btnErase);
        final TextView tampilkandatanya = (TextView)findViewById(R.id.textTampil);

        cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mainActivity.this, "Data Inputan Anda Adalah : " + inputan.getText().toString(), Toast.LENGTH_SHORT).show();
                tampilkandatanya.setText(" Data : " + inputan.getText().toString());
            }
        });

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tampilkandatanya.setText(" Data : ");
                inputan.setText("");
            }
        });
    }
}
