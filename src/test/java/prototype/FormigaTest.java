package prototype;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormigaTest {
    @Test
    public void testClone() throws CloneNotSupportedException {
        Formiga formiga = new Formiga(1, "marrom", 1.5);
        Formiga formigaClone = formiga.clone();
        formigaClone.setIdade(2);
        formigaClone.setCor("preta");
        formigaClone.setTamanho(2.0);
        assertEquals("Forminga{idade=2, cor='preta', tamanho=2.0}", formigaClone.toString());
    }
}