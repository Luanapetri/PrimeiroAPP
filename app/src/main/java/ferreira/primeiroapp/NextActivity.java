package ferreira.primeiroapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent i = getIntent();

        String textoDigitado = i.getStringExtra("texto"); //Pega o texto que foi informado
        TextView tvTexto = findViewById( R.id.tv_texto); //obtem textview
        tvTexto.setText(textoDigitado); // coloca para vizualização o texto digitado
    }
}