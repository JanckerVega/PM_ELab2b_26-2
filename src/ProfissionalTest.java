import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Escolha Personal ou Fisioterapeuta e complete 2 testes.
 * Um deles deve obrigatoriamente verificar o pagamento (registrarPagamento).
 */
public class ProfissionalTest {

    @Test
    void exemploEstruturaAaa() {
        // Arrange
        Personal personal = new Personal("Ana", "P001");
        // Act — troque/complete conforme a classe escolhida
        double aulas = personal.addAulaAvulsa(1.0);
        // Assert
        assertEquals(0.0, aulas, 0.001,
                "este exemplo só ilustra AAA; substitua pelos seus 2 testes");
    }

    @Test 
    void testLimiteAulasAvulsas() {
        Personal p = new Personal("Jancker", "P001");


        assertThrows(IllegalArgumentException.class, () -> {p.addAulaAvulsa(45);});
    }

    @Test 
    void testRegistrarPagamento() {
        Personal p = new Personal("Jancker", "P001");

        p.addAulaAvulsa(5);

        assertEquals(3929.25, p.registrarPagamento(), 0.001, "Teste para verificar se o calculo de pagamento com 5 aulas avulsas esta correto");
    }

    // TODO: criar 2 testes unitários (AAA + mensagem na asserção)
    // TODO: um deles deve testar registrarPagamento
}
