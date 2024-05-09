package models;

import interfaces.TelefoneInterface;

public class Discador implements TelefoneInterface {
    private String feature;

    public Discador(String feature) {
        this.feature = feature;
    }

    @Override
    public void ligar() {
        System.out.println("Fazendo uma chamada.");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma chamada.");
    }

    @Override
    public void iniciarCorreioDevoz() {
        System.out.println("Iniciando correio de voz.");
    }
}
