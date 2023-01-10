public class CanalAtendimentoCasosEspeciais implements CanalAtendimento {

    private static CanalAtendimentoCasosEspeciais canalAtendimentoGeral = new CanalAtendimentoCasosEspeciais();

    private CanalAtendimentoCasosEspeciais() {};

    public static CanalAtendimentoCasosEspeciais getCanalAtendimentoGeral() {
        return canalAtendimentoGeral;
    }
}
