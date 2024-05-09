package models;

import interfaces.ReprodutorInterface;

public class Itunes implements ReprodutorInterface {

    private String feature;

    public Itunes(String feature) {
        this.feature = feature;
    }

    @Override
    public void tocar() {

    }

    @Override
    public void pausar() {

    }

    @Override
    public void selecionarMusica() {

    }
}
