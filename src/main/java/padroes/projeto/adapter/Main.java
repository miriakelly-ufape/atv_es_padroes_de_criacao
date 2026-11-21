package padroes.projeto.adapter;

public class Main {
    public static void main(String[] args){
        
        CentralNotificacoes central = new CentralNotificacoes();
        Notificador interno = new NotificadorInterno();
        central.notificar(interno, "usuario123", "Bem-vindo ao sistema!");

        Notificador email = new AdaptadorEmail(new ServicoEmailExterno());
        central.notificar(email, "usuario2@email.com", "Bem-vindo ao sistema!");

        Notificador sms = new AdaptadorSMS(new ServicoSMSExterno());
        central.notificar(sms, "(81) 99999-9999", "Bem-vindo ao sistema");


    }
}
