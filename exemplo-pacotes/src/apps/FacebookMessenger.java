package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea{

    public void enviarMensagem() {
        System.out.println("Enviando Mensagem pelo Facebook");   
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo Facebook");   
    }

    @Override
    public void salvarHistorico() {
        System.out.println("Salvando histórico");
    }
    
}
