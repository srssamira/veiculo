public class Moto extends Veículo {
    String tipoDeGuidao;

    String tipo;
    double potencia;
    Motor motor = new Motor(potencia, tipo);

    public String getTipoDeGuidao() {
        return tipoDeGuidao;
    }

    public void setTipoDeGuidao(String tipoDeGuidao) {
        this.tipoDeGuidao = tipoDeGuidao;
    }

    @Override
    public String toString() {
        return "Moto {" +
                "tipoDeGuidao='" + tipoDeGuidao + '\'' +
                '}';
    }

    public void exibirInfosMoto(String tipo, double potencia){
        motor.setTipo(tipo);
        motor.setPotencia(potencia);
        System.out.println("MOTO:" +
                "\n------------------------------------------" +
                "\n" + super.marca +
                "\n" + super.ano +
                "\n" + super.modelo +
                "\n" + this.tipoDeGuidao +
                "\n------------------------------------------" +
                "\n" + "TIPO DO MOTOR: " + motor.getTipo() +
                "\n" + "POTÊNCIA DO MOTOR: " + motor.getPotencia());
    }
}
