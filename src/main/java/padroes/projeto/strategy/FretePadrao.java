package padroes.projeto.strategy;

public class FretePadrao implements EstrategiaFrete {
    
    @Override 
    public int calcularPrazoDiasUteis() { 
        return 5; 
    }

    @Override 
    public double calcularCusto(double distanciaKm) { 
        return 8.00 + 1.50 * distanciaKm; 
    }

    @Override 
    public String descricao() { 
        return "Entrega padrão"; 
    }
}
