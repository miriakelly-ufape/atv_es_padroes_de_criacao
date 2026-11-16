package padroes.projeto.factory;

public class BotaoClaro implements Botao {
    
    @Override 
    public String renderizar() { 
        return "[Botão | tema claro]"; 
    }
}
