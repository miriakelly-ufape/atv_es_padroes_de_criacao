package padroes.projeto.factory;

public class TemaClaroFactory implements InterfaceFactory {
    
    @Override 
    public Botao criarBotao() { 
        return new BotaoClaro(); 
    }

    @Override 
    public CampoTexto criarCampoTexto() { 
        return new CampoTextoClaro(); 
    }
}
