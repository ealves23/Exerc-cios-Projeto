package subsistema;

public class CrmService {
    private CrmService(){
        super();
    }

    public static void gravarNome(String nome,String cep,String cidade, String estado){
        System.out.println("Cliente salvo no sistema crm!");
        System.out.println(nome);
        System.out.println(cidade);
        System.out.println(estado);
        System.out.println(cep);

    }
}
