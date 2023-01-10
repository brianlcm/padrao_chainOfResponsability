public class FuncionarioFinanceiro extends Funcionario {

    public FuncionarioFinanceiro(Funcionario superior) {
        listaAtendimentos.add(CanalAtendimentoFinanceiro.getCanalAtendimentoFinanceiro());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Financeiro";
    }
}
