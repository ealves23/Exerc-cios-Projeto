package Singleton;
import Interfaces.ComportamentoNormal;

public class SingletonTeste {
    public static void main(String[] args) {
        
        //padrao de memoria =

        Singleton teste=Singleton.getInstancia();
        System.out.println(teste);
        Singleton testando=Singleton.getInstancia();
        System.out.println(testando);
        

    
    
    }
}
