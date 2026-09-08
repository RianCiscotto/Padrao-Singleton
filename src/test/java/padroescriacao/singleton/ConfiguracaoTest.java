package padroescriacao.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoTest {

    @Test
    public void deveRetornarIdioma() {
        Configuracao.getInstance().setIdioma("Português");

        assertEquals(
                "Português",
                Configuracao.getInstance().getIdioma()
        );
    }

    @Test
    public void deveRetornarTema() {
        Configuracao.getInstance().setTema("Escuro");

        assertEquals(
                "Escuro",
                Configuracao.getInstance().getTema()
        );
    }

    @Test
    public void deveRetornarMesmaInstancia() {
        Configuracao configuracao1 = Configuracao.getInstance();
        Configuracao configuracao2 = Configuracao.getInstance();

        assertSame(configuracao1, configuracao2);
    }
}