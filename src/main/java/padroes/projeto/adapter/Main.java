package padroes.projeto.adapter;

public class Main {
    public static void main(String[] args){
        
        CentralNotificacoes central = new CentralNotificacoes();
        Notificador interno = new NotificadorInterno();
        central.notificar(interno, "usuario123", "Bem-vindo ao sistema!");

        // TODO: continuar demonstração de uso do código
    }
}
