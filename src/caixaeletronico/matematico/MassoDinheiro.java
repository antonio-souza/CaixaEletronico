package caixaeletronico.matematico;

public class MassoDinheiro {
  private Nota nota;
  private Integer quantidadeNotas;
  private Integer valorRestante;
  
  public MassoDinheiro(Nota nota, Integer valor) {
    this.nota = nota;
    this.quantidadeNotas = valor / nota.getValor();
    this.valorRestante = quantidadeNotas > 0 ? valor % nota.getValor() : valor;
  }
  
  public Integer getQuantidadeNotas() {
    return quantidadeNotas;
  }

  public Integer getValorRestante() {
    return valorRestante;
  }

  @Override
  public String toString() {
    return String.format("%s nota(s) de %s reais.", quantidadeNotas, nota.getNome());
  }
}