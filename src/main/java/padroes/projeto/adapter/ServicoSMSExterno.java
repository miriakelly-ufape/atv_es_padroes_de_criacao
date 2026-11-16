package padroes.projeto.adapter;

public class ServicoSMSExterno {
    
    public void transmitirSms(String numeroTelefone, String texto, boolean confirmarEnvio) {
        System.out.println("SMS para " + numeroTelefone + ": " + texto
            + " | confirmação: " + confirmarEnvio);
    }
}
