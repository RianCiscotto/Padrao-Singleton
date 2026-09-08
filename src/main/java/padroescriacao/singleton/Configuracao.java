package padroescriacao.singleton;

public class Configuracao {

    private static Configuracao instance = new Configuracao();

    private String idioma;
    private String tema;

    private Configuracao() {
    }

    public static Configuracao getInstance() {
        return instance;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
}