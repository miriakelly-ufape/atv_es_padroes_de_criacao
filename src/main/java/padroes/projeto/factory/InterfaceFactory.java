package padroes.projeto.factory;

public interface InterfaceFactory {

    Botao criarBotao();
    CampoTexto criarCampoTexto();

    static InterfaceFactory getFactory(String tema) {
        return switch (tema.toLowerCase()) {
            case "claro" -> new TemaClaroFactory();
            case "escuro" -> new TemaEscuroFactory();
            default -> throw new IllegalArgumentException("Tema desconhecido: " + tema);
        };
    }
}
