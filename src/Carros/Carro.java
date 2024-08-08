package Carros;

public class Carro {
    private String modelo;
    private String anoFabricacao;
    private String cor;
    private String cavalos;
    private String torque;

    public Carro(String modelo, String anoFabricacao, String cor, String cavalos, String torque) {
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.cavalos = cavalos;
        this.torque = torque;

    }

    public void checarOleo(){
        System.out.println("Oleo Ok");
    }
    public void checarPneus(){
        System.out.println("Pneus Ok");
    }
    public void checarTanque(){
        System.out.println("Tanque Ok");
    }
    public void checarMotor(){
        System.out.println("Motor Ok");
    }
    public void checarTravasAlarmes(){
        System.out.println("Travas Alarmes Ok");
    }

    public void ligarMotor(){
        System.out.println("\nIniciando motor... Modelo:"+this.modelo+", "+this.cavalos+" cavalos de potencia "+this.torque+"kgfm de Torque.\nMotor iniciado!");
    }


}
