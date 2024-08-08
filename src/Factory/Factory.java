package Factory;
import Carros.Carro;

public abstract class Factory {

    public Carro createCarro(String modelo){
        Carro carro = fabricar(modelo);
        carro = revisao(carro);
        return carro;
    }

    private Carro revisao(Carro carro) {
        carro.checarPneus();
        carro.checarOleo();
        carro.checarMotor();
        carro.checarTanque();
        carro.checarTravasAlarmes();
        return carro;
    }


    abstract Carro fabricar(String modelo);
}
