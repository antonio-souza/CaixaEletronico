package caixaeletronico.strategy;

public class Cedula {

  private TipoCedula tipo;

  private Integer    quantidade;

  private Integer    valorRestante;

  public Cedula(TipoCedula tipo, Integer valor) {
    this.tipo = tipo;
    this.quantidade = 0;
    this.valorRestante = valor;
    this.calcularQuantidadeCedulas();
  }

  private void calcularQuantidadeCedulas() {
    if (valorRestante < tipo.getValor()) {
      return;
    }
    this.quantidade++;
    valorRestante -= tipo.getValor();
    this.calcularQuantidadeCedulas();
  }

  public Integer getQuantidadeCedulas() {
    return quantidade;
  }

  public Integer getValorRestante() {
    return valorRestante;
  }

  @Override
  public String toString() {
    return String.format("%s cédulas(s) de %s reais.", quantidade, tipo.getNome());
  }
}