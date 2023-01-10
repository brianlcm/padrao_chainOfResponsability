public class FuncionarioSecretaria extends Funcionario {

    public FuncionarioSecretaria(Funcionario superior) {
        listaAtendimentos.add(CanalAtendimentoContratacao.getCanalAtendimentoContratacao());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Secretária/o";
    }
}
