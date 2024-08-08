import Carros.Carro;
import Factory.Factory;

public class Main {
    private static final Validacao validacao = new Validacao();

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Deiner","BMW",true,"BMWX6M");
        Factory factory = validacao.testeDriveDisponivel(cliente);
        Carro carro = factory.createCarro(cliente.getInteresseModelo());
        carro.ligarMotor();

    }
















}