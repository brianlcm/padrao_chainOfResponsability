import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtendimentoTest {

    FuncionarioGerente funcionarioGerente;
    FuncionarioFinanceiro funcionarioFinaneiro;
    FuncionarioTecnico funcionarioTecnico;
    FuncionarioSecretaria funcionarioSecretaria;

    @BeforeEach
    void setUp() {
        funcionarioGerente = new FuncionarioGerente(null);
        funcionarioFinaneiro = new FuncionarioFinanceiro(funcionarioGerente);
        funcionarioTecnico = new FuncionarioTecnico(funcionarioGerente);
        funcionarioSecretaria = new FuncionarioSecretaria(funcionarioGerente);
    }

    @Test
    void deveRetornarSecretariaParaAtendimentoContratacao() {
        assertEquals("Secretária/o", funcionarioSecretaria.atenderChamado(new Atendimento(CanalAtendimentoContratacao.getCanalAtendimentoContratacao())));
    }

    @Test
    void deveRetornarTecnicoParaAtentimentoTecnico() {
        assertEquals("Técnica/o", funcionarioTecnico.atenderChamado(new Atendimento(CanalAtendimentoSuporteTecnico.getCanalAtendimentoSuporteTecnico())));
    }

    @Test
    void deveRetornarFinanceiroParaAtendimentoFinanceiro() {
        assertEquals("Financeiro", funcionarioFinaneiro.atenderChamado(new Atendimento(CanalAtendimentoFinanceiro.getCanalAtendimentoFinanceiro())));
    }

    @Test
    void deveRetornarGerenteParaAtendimentoEspecial() {
        assertEquals("Gerente", funcionarioGerente.atenderChamado(new Atendimento(CanalAtendimentoCasosEspeciais.getCanalAtendimentoGeral())));
    }

}