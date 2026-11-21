package padroes.projeto.factory;

public class TemaEscuroFactory implements InterfaceFactory  {
    @Override
        public Botao criarBotao() {
            return new BotaoEscuro();
        }

    @Override
    public CampoTexto criarCampoTexto() {
        return new CampoTextoEscuro();
    }

}
