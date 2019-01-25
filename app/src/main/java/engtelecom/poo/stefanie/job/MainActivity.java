package engtelecom.poo.stefanie.job;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void telaCombustivel(View view)
    {
        // OBJETO QUE DISPARA ACTIVITY NA TELA
        Intent messageIntent = new Intent(this, CombustivelActivity.class);

        startActivityForResult(messageIntent,20);
    }

    public void telaTrabalho(View view)
    {
        // OBJETO QUE DISPARA ACTIVITY NA TELA
        Intent messageIntent = new Intent(this, TrabalhoActivity.class);

        startActivityForResult(messageIntent,20);
    }

    public void telaDescontos(View view)
    {
        // OBJETO QUE DISPARA ACTIVITY NA TELA
        Intent messageIntent = new Intent(this, DescontosActivity.class);

        startActivityForResult(messageIntent,20);
    }

    public void telaBrutoLiquido(View view)
    {
        // OBJETO QUE DISPARA ACTIVITY NA TELA
        Intent messageIntent = new Intent(this, BrutoLiquidoActivity.class);

        startActivityForResult(messageIntent,20);
    }
}
