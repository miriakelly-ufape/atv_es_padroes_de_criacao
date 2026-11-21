package padroes.projeto.adapter;

public class AdaptadorSMS implements Notificador{
    private ServicoSMSExterno servicoSMS;

    public AdaptadorSMS(ServicoSMSExterno servicoSMSExterno) {
        this.servicoSMS = servicoSMSExterno;
    }

    @Override
    public void enviar(String destinatario, String mensagem) {
        servicoSMS.transmitirSms(destinatario, mensagem, true);
    }
}
