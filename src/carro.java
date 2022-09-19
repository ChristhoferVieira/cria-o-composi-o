
public class carro {

    private motor motor;
    private direcao direcao;

    public carro() {
        motor = new motor();
    }

    public void ImprimeDados() {
        System.out.println("Potencia do motor: " + motor.getPotencia());
    }

    public void ligarCarro(int potencia) {
        motor = new motor(potencia);
    }

    public carro(int potencia) {
        motor = new motor(potencia);
    }

    public motor getMotor() {
        return motor;
    }

    public void setMotor(motor motor) {
        this.motor = motor;
    }

    public direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(direcao direcao) {
        this.direcao = direcao;
    }

}
