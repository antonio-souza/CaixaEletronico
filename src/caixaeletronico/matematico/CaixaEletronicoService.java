package caixaeletronico.matematico;

import java.util.List;

public class CaixaEletronicoService {

  public List<MassoDinheiro> sacar(Integer valorTotal) {
    CaixaEletronico caixaEletronico = new CaixaEletronico();
    return caixaEletronico.sacar(valorTotal);
  }
}