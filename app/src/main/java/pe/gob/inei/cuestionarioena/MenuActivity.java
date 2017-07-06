package pe.gob.inei.cuestionarioena;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    private Button btnControlN1;
    private Button btnControlN2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnControlN1 = (Button) findViewById(R.id.btnControln1);
        btnControlN2 = (Button) findViewById(R.id.btnControln2);

        btnControlN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Cuestionario1Activity.class);
                startActivity(intent);
            }
        });
        btnControlN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Cuestionario2Activity.class);
                startActivity(intent);
            }
        });
    }
}
