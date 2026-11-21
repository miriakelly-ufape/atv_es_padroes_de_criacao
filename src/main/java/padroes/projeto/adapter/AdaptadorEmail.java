package padroes.projeto.adapter;

public class AdaptadorEmail implements Notificador{
    private ServicoEmailExterno servicoEmail;

    public AdaptadorEmail(ServicoEmailExterno servicoEmail){
        this.servicoEmail = servicoEmail;
    }


    @Override
    public void enviar(String destinario, String mensagem){
        servicoEmail.despacharEmail(destinario, "Notificação do sistema", mensagem);
    }

}
