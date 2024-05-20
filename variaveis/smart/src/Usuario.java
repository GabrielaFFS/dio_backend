public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv ();
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println(" Em qual canal está? " + smartTv.canal);
       
        smartTv.mudarCanal(18);

        System.out.println(" Em qual canal está agora? " + smartTv.canal);
       

        System.out.println(" Qual o volume atual? " + smartTv.volume);
        
        
        System.out.println(" A TV está ligada? " + smartTv.ligada);
        System.out.println(" Em qual canal? " + smartTv.canal);
        System.out.println(" Qual o volume? " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println(" Atualizacão- A TV está ligada? " + smartTv.ligada);

    }
}
