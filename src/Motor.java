public class Motor {
    double potencia;
    String tipo;

    public Motor(double potencia, String tipo){
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "potencia=" + potencia +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
