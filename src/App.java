public class App {
    public static void main(String[] args) {
        Moto moto = new Moto();
        Carro carro = new Carro();

        carro.setAno(2024);
        carro.setMarca("BMW");
        carro.setModelo("X2");
        carro.setNumeroDePortas(4);

        moto.setAno(2022);
        moto.setMarca("HONDA");
        moto.setModelo("BIZ");
        moto.setTipoDeGuidao("CROSS");

        carro.exibirInfosCarro("V", 2.0);
        System.out.println("\n=======================================\n");
        moto.exibirInfosMoto("Boxer", 1.2);
    }
}