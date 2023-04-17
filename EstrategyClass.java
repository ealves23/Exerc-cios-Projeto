package Interfaces;

import Facade.FacadeExemplo;

public class EstrategyClass {
    public static void main(String[] args) {
        
        Comportamento defensivo=new ComportamentoDefensivo();   
        Comportamento normal=new ComportamentoNormal();   
        Comportamento agressivo=new ComportamentoAgressivo();   

        EstrategyRobo robo=new EstrategyRobo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();


        FacadeExemplo facade=new FacadeExemplo();
        facade.migrarCliente("Jose","987755543");



    }
}
