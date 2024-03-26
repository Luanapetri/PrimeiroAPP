package ferreira.primeiroapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //classe que representa a tela principal
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Constroi a interface da tela



        Button btnEnviar = findViewById(R.id.btn_enviar); //Determina o botão enviar
        btnEnviar. setOnClickListener(new View.OnClickListener() { //Configura a ação
            @Override
            public void onClick(View v) {  //Determina a função a seguir do botão
                EditText etDigitealgoaqui = findViewById(R.id.et_digite_aqui); //Faz a busca da caixa de texto
                String textoDigitado = etDigitealgoaqui.getText().toString(); //Obtem o texto que está na caixa de texto

                Intent i = new Intent(MainActivity.this, NextActivity.class);

                i.putExtra( "texto", textoDigitado);

                startActivity(i); //Executa a intenção na função da linha anterior
            }
        });

        }
    }
