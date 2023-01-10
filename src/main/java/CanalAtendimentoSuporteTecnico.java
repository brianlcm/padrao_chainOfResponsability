public class CanalAtendimentoSuporteTecnico implements CanalAtendimento {

    private static CanalAtendimentoSuporteTecnico canalAtendimentoSuporteTecnico = new CanalAtendimentoSuporteTecnico();

    private CanalAtendimentoSuporteTecnico() {};

    public static CanalAtendimentoSuporteTecnico getCanalAtendimentoSuporteTecnico() {
        return canalAtendimentoSuporteTecnico;
    }
}
