import models.Discador;
import models.Iphone;
import models.Itunes;
import models.Safari;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // criando as funcionalidades
        Discador discador = new Discador("Discador padrão");
        Safari safari = new Safari("Navedador Web");
        Itunes itunes = new Itunes("Reprodutor de músicas");

        // criando o Iphone
        Iphone iphone = new Iphone(discador, itunes, safari);

        // testando funcionalidades
        iphone.getDiscador().atender();
        iphone.getItunes().tocar();
        iphone.getSafari().exibirPagina();

    }
}