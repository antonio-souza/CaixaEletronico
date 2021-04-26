package caixaeletronico.matematico;

import java.util.ArrayList;
import java.util.List;

public class CaixaEletronico {
  
  public List<MassoDinheiro> sacar(Integer valorTotal) {    
    proibirValorMenorQueDez(valorTotal);   
    proibirValorNaoMultiploDeDez(valorTotal);   
    
    List<MassoDinheiro> massos = new ArrayList<MassoDinheiro>();
    Integer valorRestante = valorTotal;
    
    for (Nota nota : Nota.values()) {
      MassoDinheiro masso = new MassoDinheiro(nota, valorRestante);
      massos.add(masso);
      valorRestante = masso.getValorRestante();
    }
    return massos;      
  }

  private void proibirValorNaoMultiploDeDez(Integer valorTotal) {
    if (valorTotal % 10 != 0) {
      throw new IllegalArgumentException("Informe um valor múltiplo de 10.");
    }
  }

  private void proibirValorMenorQueDez(Integer valorTotal) {
    if (valorTotal < 10) {
      throw new IllegalArgumentException("Informe um valor maior ou igual a 10.");
    }
  }
}