package dio;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import org.junit.jupiter.api.Assertions;

public class PessoaTest {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jessica", LocalDate.of(2000,1,1));
        Assertions.assertEquals(22,jessica.getIdade());
    };

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa jessica = new Pessoa("Jessica", LocalDate.of(2000,1,1));
        Assertions.assertTrue(jessica.ehMaiorDeIdade());

        Pessoa guilherme = new Pessoa("Guilherme", LocalDate.of(2006,12,5));
        Assertions.assertFalse(guilherme.ehMaiorDeIdade());
    };

    @Test
    void validarLancamentos() {
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {10, 20, 30, 40, 50};

        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNuloe() {
        Pessoa Francisco = null;

        Assertions.assertNull(Francisco);

        Francisco = new Pessoa("Francisco", LocalDate.of(1986,3,20));

        Assertions.assertNotNull(Francisco);
    };


}
