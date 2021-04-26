package caixaeletronico.strategy;

public enum TipoCedula {
  CEM(100, "cem"),
  CINQUENTA(50, "cinquenta"),
  VINTE(20, "vinte"),
  DEZ(10, "dez");
  
  private Integer valor;
  private String nome;
  
  private TipoCedula(Integer valor, String nome) {
    this.valor = valor;
    this.nome = nome;
  }
  
  public Integer getValor() {
    return valor;
  }

  public String getNome() {
    return nome;
  }
}