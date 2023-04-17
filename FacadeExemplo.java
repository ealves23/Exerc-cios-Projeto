package Facade;

import subsistema.CrmService;
import subsistema2.CepApi;

public class FacadeExemplo {
    public void migrarCliente(String nome,String cep){
        String cidade=CepApi.getInstancia().recuperCidade(cep);
        String estado=CepApi.getInstancia().recuperEstado(cep);
    
        CrmService.gravarNome(nome, cep, cidade,estado);


    }
}
