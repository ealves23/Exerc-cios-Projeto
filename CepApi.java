package subsistema2;

public class CepApi {
    
    private static CepApi instancia=new CepApi();

    private CepApi(){
        super();
    } 
    public static CepApi getInstancia(){
        return instancia;

    }

    public String recuperCidade(String cep){
        return "Campinas";

    }

    public String recuperEstado(String cep){
        return "SP";
    }
}
