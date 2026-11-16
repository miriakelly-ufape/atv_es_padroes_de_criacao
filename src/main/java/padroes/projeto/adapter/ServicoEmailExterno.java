package padroes.projeto.adapter;

public class ServicoEmailExterno {
    
    public void despacharEmail(String enderecoEmail, String assunto, String corpo) {
        System.out.println("E-mail para " + enderecoEmail + " | " + assunto + ": " + corpo);
    }
}
