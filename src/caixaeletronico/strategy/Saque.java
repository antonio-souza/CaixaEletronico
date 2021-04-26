package caixaeletronico.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Saque {

  private List<Cedula>  cedulas;

  private Integer       valorRestante;

  private StringBuilder descricao;

  public Saque(Integer valor) {
    super();

    this.valorRestante = valor;
    this.cedulas = new ArrayList<>();
    this.descricao = new StringBuilder();

    this.proibirValorMenorQueDez();
    this.criarMassosCedula(Arrays.asList(TipoCedula.values()));
    this.proibirValorNaoMultiploDeDez();
  }

  public List<Cedula> getCedulas() {
    return cedulas;
  }

  private void criarMassosCedula(List<TipoCedula> tiposCedulas) {
    if (tiposCedulas.isEmpty()) {
      return;
    }
    List<TipoCedula> tiposCedulasRestantes = new ArrayList<>(tiposCedulas);
    TipoCedula tipoCedula = tiposCedulasRestantes.get(0);
    Cedula cedula = new Cedula(tipoCedula, valorRestante);

    cedulas.add(cedula);
    descricao.append(cedula.toString()).append("\n");

    valorRestante = cedula.getValorRestante();
    tiposCedulasRestantes.remove(tipoCedula);

    this.criarMassosCedula(tiposCedulasRestantes);
  }

  private void proibirValorMenorQueDez() {
    if (valorRestante < 10) {
      throw new IllegalArgumentException("Informe um valor maior ou igual a 10.");
    }
  }

  private void proibirValorNaoMultiploDeDez() {
    if (valorRestante != 0) {
      throw new IllegalArgumentException("Informe um valor múltiplo de 10.");
    }
  }

  @Override
  public String toString() {
    return descricao.toString();
  }
}