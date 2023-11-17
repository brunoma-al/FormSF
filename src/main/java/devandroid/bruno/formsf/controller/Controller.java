package devandroid.bruno.formsf.controller;

import android.util.Log;

import androidx.annotation.NonNull;

import devandroid.bruno.formsf.model.Classe;

public class Controller {

    @NonNull
    @Override
    public String toString() {

        Log.d("Controller-MVC", "Controller iniciada...");
        return super.toString();
    }

    public void salvar(Classe objeto) {
        Log.d("Controller-MVC", "Salvo:" +objeto.toString());
    }
}
