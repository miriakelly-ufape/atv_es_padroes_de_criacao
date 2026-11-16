package padroes.projeto.strategy;

public interface EstrategiaFrete {
    int calcularPrazoDiasUteis();
    double calcularCusto(double distanciaKm);
    String descricao();
}
