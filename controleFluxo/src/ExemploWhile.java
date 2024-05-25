import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
       double mesada = 50.0;
       while (mesada>0){
           Double valorDoce= valorAleatorio ();
           if (valorDoce > mesada) 
            valorDoce = mesada;
            System.out.println( "Valor do doce é: " + valorDoce);
            mesada = mesada-valorDoce;
           

        }
        System.out.println("O valor da mesada é: " + mesada);
        System.out.println("Joãozinho gastou toda a mesada");

       } 
       private static double valorAleatorio (){
        return ThreadLocalRandom.current ().nextDouble (2, 8 );
       }
    }
    

