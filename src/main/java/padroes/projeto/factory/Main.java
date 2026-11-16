package padroes.projeto.factory;

public class Main {
    public static void main(String[] args) {

        InterfaceFactory fabrica = InterfaceFactory.getFactory("claro");

        Botao botao = fabrica.criarBotao();
        System.out.println(botao.renderizar());

        CampoTexto campoTexto = fabrica.criarCampoTexto();
        System.out.println(campoTexto.renderizar());

        //TODO: continuar demonstração de uso do código
     }
}
