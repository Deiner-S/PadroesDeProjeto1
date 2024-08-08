public class Cliente {
    private String nome;
    private String intereceMarca;
    private String interesseModelo;
    private boolean testeDrive;

    public Cliente(String nome, String intereceMarca, boolean testeDrive, String interesseModelo) {
        this.nome = nome;
        this.intereceMarca = intereceMarca;
        this.testeDrive = testeDrive;
        this.interesseModelo = interesseModelo;
    }

    public String getInteresseModelo() {
        return interesseModelo;
    }

    public String getNome() {
        return nome;
    }

    public String getIntereceMarca() {
        return intereceMarca;
    }

    public boolean isTesteDrive() {
        return testeDrive;
    }

}
