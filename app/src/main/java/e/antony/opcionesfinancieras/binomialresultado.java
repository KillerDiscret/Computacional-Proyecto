package e.antony.opcionesfinancieras;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class binomialresultado extends AppCompatActivity {
    EditText entradaS, entradaK, entradaC;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binomialresultado);
        entradaS= findViewById(R.id.editTextS);
        entradaK=findViewById(R.id.editTextK);
        entradaC=findViewById(R.id.editTextC);
        resultado=findViewById(R.id.textViewResultado);
        int n1=Integer.parseInt(entradaS.getText().toString());
        int n2=Integer.parseInt(entradaK.getText().toString());
        int n3=Integer.parseInt(entradaC.getText().toString());
        int r=(n1-n2)-n3;
        resultado.setText(String.valueOf(r));


    }

}
