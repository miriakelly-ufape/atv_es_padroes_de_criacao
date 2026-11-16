package padroes.projeto.strategy;

public class CalculadoraFrete {

    private EstrategiaFrete estrategia;

    public void setEstrategia(EstrategiaFrete estrategia) {
        if (estrategia == null) throw new IllegalArgumentException("Estratégia obrigatória");
        this.estrategia = estrategia;
    }
    
    public void calcularFrete(double distanciaKm) {
        if (estrategia == null) throw new IllegalStateException("Defina a estratégia primeiro");
        if (distanciaKm < 0) throw new IllegalArgumentException("Distância inválida");
        System.out.println("Modalidade: " + estrategia.descricao());
        System.out.println("Prazo: " + estrategia.calcularPrazoDiasUteis() + " dias úteis");
        System.out.printf("Custo: R$ %.2f%n", estrategia.calcularCusto(distanciaKm));
    }
}
