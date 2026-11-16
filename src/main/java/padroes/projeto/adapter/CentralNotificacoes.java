package padroes.projeto.adapter;

public class CentralNotificacoes {
    
    public void notificar(Notificador notificador, String destinatario, String mensagem) {
        notificador.enviar(destinatario, mensagem);
    }
}
