package composicao;

public class Carro {
    private String modelo;
    private String cor;
    // Composicao: um objeto(carro) ser composto por outro objeto (motor)
    private Motor motor;
    private boolean escada;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;

    }

    public String getCor() {
        return cor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Motor getMotor() {
        return motor;
    }

    /*
     * Observaçao: para atributos do tipo boolean, por onvencao em Java o getter é
     * isEcada()
     * em vez de getEscada(). Ambos podem funcionar, ma is o padrao adotado pela
     * linguagem e pelas principais bibliotecas.
     */

    public boolean isEscada() {
        return escada;
    }

    public void setEscada(boolean escada) {
        this.escada = escada;
    }

    @Override
    public String toString() {
        return String.format("""
                Carro:
                Modelo: %s
                Cor: %s
                Tem escada: %s
                """, modelo, cor, escada);
    }

}
