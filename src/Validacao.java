import Factory.*;

public class Validacao {

    public Factory testeDriveDisponivel(Cliente cliente) {
        if(cliente.isTesteDrive()) {
            switch (cliente.getIntereceMarca().toLowerCase()){
                case "bmw":
                    return new FactoryBMW();
                case "audi":
                    return new FactoryAudi();
                default: System.out.println("Não trabalhamos com a martca informada");
            }

        }else{
            System.out.println("Cliente "+cliente.getNome()+" não disponivel para teste drive.");
        }
        return null;
    }
}
