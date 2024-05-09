package models;

import interfaces.ReprodutorInterface;

public class Itunes implements ReprodutorInterface {

    private String feature;

    public Itunes(String feature) {
        this.feature = feature;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada.");
    }
}
