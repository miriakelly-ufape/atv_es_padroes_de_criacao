package padroes.projeto.factory;

public class CampoTextoEscuro implements CampoTexto {

    @Override
    public String renderizar() {
        return "[Campo de texto | tema escuro]";
    }
}
