package padroes.projeto.factory;

public class Main {
    public static void main(String[] args) {

        InterfaceFactory fabrica = InterfaceFactory.getFactory("claro");

        Botao botaoclaro = fabrica.criarBotao();
        System.out.println(botaoclaro.renderizar());

        CampoTexto campoTexto = fabrica.criarCampoTexto();
        System.out.println(campoTexto.renderizar());

        //TODO: continuar demonstração de uso do código

        InterfaceFactory fabricaEscura = InterfaceFactory.getFactory("escuro");

        Botao botaoEscuro = fabricaEscura.criarBotao();
        System.out.println(botaoEscuro.renderizar());

        CampoTexto campoTextoEscuro = fabricaEscura.criarCampoTexto();
        System.out.println(campoTextoEscuro.renderizar());
     }
}
