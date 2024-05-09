package models;

import interfaces.TelefoneInterface;

public class Discador implements TelefoneInterface {
    private String feature;

    public Discador(String feature) {
        this.feature = feature;
    }

    @Override
    public void ligar() {

    }

    @Override
    public void atender() {

    }

    @Override
    public void iniciarCorreioDevoz() {

    }
}
