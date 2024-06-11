package apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
    public abstract void salvarHistorico();

    protected void validarConectadoInternet (){
    System.out.println(" Validando conexão");
    }

}
    