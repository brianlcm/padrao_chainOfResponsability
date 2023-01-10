import java.util.ArrayList;

public abstract class Funcionario {

    protected ArrayList listaAtendimentos = new ArrayList();
    private Funcionario funcionarioSuperior;

    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }

    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String atenderChamado(Atendimento atendimento) {
        if (listaAtendimentos.contains(atendimento.getCanalAtendimento())) {
            return getDescricaoCargo();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.atenderChamado(atendimento);
            }
            else
            {
                return "Sem atendimento";
            }
        }
    }
}
