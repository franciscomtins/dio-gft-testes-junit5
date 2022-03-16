package dio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExceptionsTeste {

    @Test
    void validaCenarioExcecaoNaTransferencia(){
        Conta contaOrigem = new Conta("12345", 0);
        Conta contaDestino = new Conta("6789",100);

        TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

        Assertions.assertThrows(IllegalArgumentException.class, ()->
                transferenciaEntreContas.trasfere(contaOrigem,contaDestino,-1));

    }

}
