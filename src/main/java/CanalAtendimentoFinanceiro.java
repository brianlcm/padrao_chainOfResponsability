public class CanalAtendimentoFinanceiro implements CanalAtendimento {

    private static CanalAtendimentoFinanceiro canalAtendimentoFinanceiro = new CanalAtendimentoFinanceiro();

    private CanalAtendimentoFinanceiro() {};

    public static CanalAtendimentoFinanceiro getCanalAtendimentoFinanceiro() {
        return canalAtendimentoFinanceiro;
    }
}
