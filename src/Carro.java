public class Carro extends Veículo {
    int numeroDePortas;

    String tipo;
    double potencia;
    Motor motor = new Motor(potencia, tipo);

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "numeroDePortas=" + numeroDePortas +
                '}';
    }

    public void exibirInfosCarro(String tipo, double potencia){

        motor.setTipo(tipo);
        motor.setPotencia(potencia);
        System.out.println("CARRO:" +
                "\n------------------------------------------" +
                "\n" + "MARCA: "+ super.marca +
                "\n" + "ANO: " + super.ano +
                "\n" + "MODELO: "+ super.modelo +
                "\n" + "NUMERO DE PORTAS" + this.numeroDePortas +
                "\n------------------------------------------" +
                "\n" + "TIPO DO MOTOR: " + motor.getTipo() +
                "\n" + "POTÊNCIA DO MOTOR: " + motor.getPotencia());
        }
}
