package Factory;

import Carros.BMW.BMWIX;
import Carros.BMW.BMWX6M;
import Carros.BMW.BMWX7;
import Carros.Carro;

public class FactoryBMW extends Factory {



    @Override
    Carro fabricar(String modelo) {
        switch (modelo) {
            case "BMWIX":
                return new BMWIX("BMWIX", "2024", "Azul", "523", "78");
            case "BMWX6M":
                return new BMWX6M("BMWX6M", "2024", "Vermelho", "625", "76,5");
            case "BMWX7":
                return new BMWX7("BMWX7", "2024", "Amarelo", "530", "76.4");
            default:
                 System.out.println("Carro não encontrado!");
                 return null;
        }

    }
}
