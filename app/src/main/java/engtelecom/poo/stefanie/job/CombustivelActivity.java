package engtelecom.poo.stefanie.job;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class CombustivelActivity extends AppCompatActivity
{
    private EditText editPago;
    private EditText editPreco;
    private TextView textEsperado;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combustivel);
    }

    public void calcular(View view)
    {
        editPago = findViewById(R.id.pago);
        editPreco = findViewById(R.id.preco);
        textEsperado = findViewById(R.id.esperado);

        Button buttonCalcular = findViewById(R.id.calcular);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                float valorPago = Float.parseFloat(editPago.getText().toString());
                float valorPreco = Float.parseFloat(editPreco.getText().toString());

                float valorCalculado = valorPago / valorPreco;
                textEsperado.setText(valorCalculado + " litros");
            }
        });
    }
}
