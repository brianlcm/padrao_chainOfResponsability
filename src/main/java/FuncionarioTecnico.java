public class FuncionarioTecnico extends Funcionario {

    public FuncionarioTecnico(Funcionario superior) {
        listaAtendimentos.add(CanalAtendimentoSuporteTecnico.getCanalAtendimentoSuporteTecnico());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Técnica/o";
    }
}
