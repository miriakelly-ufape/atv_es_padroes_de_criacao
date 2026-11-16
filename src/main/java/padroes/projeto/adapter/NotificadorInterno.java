package padroes.projeto.adapter;

public class NotificadorInterno implements Notificador {
    
    @Override 
    public void enviar(String destinatario, String mensagem) {
        System.out.println("Notificação interna para " + destinatario + ": " + mensagem);
    }
}
