package models;

import interfaces.NavegadorInterface;

public class Safari implements NavegadorInterface {

    private String feature;

    public Safari(String feature) {
        this.feature = feature;
    }

    @Override
    public void exibirPagina() {

    }

    @Override
    public void adicionarNovaAba() {

    }

    @Override
    public void atualizarPagina() {

    }
}
