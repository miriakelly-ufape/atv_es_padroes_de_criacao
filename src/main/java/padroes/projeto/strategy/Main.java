package padroes.projeto.strategy;

public class Main {
    public static void main(String[] args) {

        CalculadoraFrete app = new CalculadoraFrete();
        double distancia = 18.0;

        // Estratégia 1: entrega padrão
        System.out.println("=== Opção 1 ===");
        app.setEstrategia(new FretePadrao());
        app.calcularFrete(distancia);

        System.out.println();

        //TODO: continuar demonstração de uso do código
    }
}
