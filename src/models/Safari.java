package models;

import interfaces.NavegadorInterface;

public class Safari implements NavegadorInterface {

    private String feature;

    public Safari(String feature) {
        this.feature = feature;
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página da web.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionada nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
}
