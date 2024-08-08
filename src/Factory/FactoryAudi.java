package Factory;


import Carros.Audi.AudiA3Sportback;
import Carros.Audi.AudiQ8;
import Carros.Audi.RS5Sportback;
import Carros.BMW.BMWX6M;
import Carros.Carro;

public class FactoryAudi extends Factory {


    @Override
    Carro fabricar(String modelo) {

        switch (modelo) {
            case "AudiA3Sportback":
                return new AudiA3Sportback("AudiA3Sportback", "2024", "Azul", "220 ", "35,0");
            case "AudiQ8":
                return new AudiQ8("AudiQ8", "2024", "Vermelho", "340 ", "50,9");
            case "RS5Sportback":
                return new RS5Sportback("RS5Sportback", "2024", "Amarelo", "450", "61.18");
            default:
                System.out.println("Carro não encontrado!");
                return null;
        }
    }
}
