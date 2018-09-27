package e.antony.opcionesfinancieras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class binomial extends AppCompatActivity {
Button boton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binomial);
boton2= findViewById(R.id.boton2);

boton2.setOnClickListener(
        new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    Intent irventana3= new Intent(binomial.this,binomialresultado.class);
                    startActivity(irventana3);

            }
        }


);

    }

}
