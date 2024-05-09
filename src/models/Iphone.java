package models;

public class Iphone {

    private Discador discador;

    private  Itunes itunes;

    private Safari safari;

    public Iphone(Discador discador, Itunes itunes, Safari safari) {
        this.discador = discador;
        this.itunes = itunes;
        this.safari = safari;
    }

    public Itunes getItunes() {
        return itunes;
    }

    public void setItunes(Itunes itunes) {
        this.itunes = itunes;
    }

    public Safari getSafari() {
        return safari;
    }

    public void setSafari(Safari safari) {
        this.safari = safari;
    }

    public Discador getDiscador() {
        return discador;
    }

    public void setDiscador(Discador discador) {
        this.discador = discador;
    }
}
