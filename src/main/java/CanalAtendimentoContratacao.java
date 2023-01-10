public class CanalAtendimentoContratacao implements CanalAtendimento {

    private static CanalAtendimentoContratacao canalAtendimentoContratacao = new CanalAtendimentoContratacao();

    private CanalAtendimentoContratacao() {};

    public static CanalAtendimentoContratacao getCanalAtendimentoContratacao() {
        return canalAtendimentoContratacao;
    }
}
