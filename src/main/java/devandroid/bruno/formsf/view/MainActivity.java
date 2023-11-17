package devandroid.bruno.formsf.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import devandroid.bruno.formsf.R;
import devandroid.bruno.formsf.controller.Controller;
import devandroid.bruno.formsf.model.Classe;

public class MainActivity extends AppCompatActivity {

    Controller controller;
    Classe objeto;
    Classe outroObjeto;

    EditText editNome;
    EditText editSobrenome;
    EditText editEmail;
    EditText editEndereco;
    EditText editCandidatura;
    EditText editSenha;

    Button btnLimpar;
    Button btnSalvar;
    Button btnFinalizar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new Controller();
        controller.toString();

        objeto = new Classe();
        objeto.setPrimeiroNome("");
        objeto.setSobreNome("");
        objeto.setClienteEmail("");
        objeto.setClienteEndereco("");
        objeto.setClienteCandidatura("");
        objeto.setClienteSenha("");

        outroObjeto = new Classe();
        outroObjeto.setPrimeiroNome("");
        outroObjeto.setSobreNome("");
        outroObjeto.setClienteEmail("");
        outroObjeto.setClienteEndereco("");
        outroObjeto.setClienteCandidatura("");
        outroObjeto.setClienteSenha("");

        editNome = findViewById(R.id.editNome);
        editSobrenome = findViewById(R.id.editSobrenome);
        editEmail = findViewById(R.id.editEmail);
        editEndereco = findViewById(R.id.editEndereco);
        editCandidatura = findViewById(R.id.editCandidatura);
        editSenha = findViewById(R.id.editSenha);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);
        btnFinalizar = findViewById(R.id.btnFinalizar);

        editNome.setText(objeto.getPrimeiroNome());
        editSobrenome.setText(objeto.getSobreNome());
        editEmail.setText(objeto.getClienteEmail());
        editEndereco.setText(objeto.getClienteEndereco());
        editCandidatura.setText(objeto.getClienteCandidatura());
        editSenha.setText(objeto.getClienteSenha());

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editNome.setText("");
                editSobrenome.setText("");
                editEmail.setText("");
                editEndereco.setText("");
                editCandidatura.setText("");
                editSenha.setText("");
            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                objeto.setPrimeiroNome(editNome.getText().toString());
                objeto.setSobreNome(editSobrenome.getText().toString());
                objeto.setClienteEmail(editEmail.getText().toString());
                objeto.setClienteEndereco(editEndereco.getText().toString());
                objeto.setClienteCandidatura(editCandidatura.getText().toString());
                objeto.setClienteSenha(editSenha.getText().toString());

                Toast.makeText(MainActivity.this, "Salvo"+objeto.toString(), Toast.LENGTH_SHORT).show();
                controller.salvar(objeto);
            }
        });

        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Finalizado", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}