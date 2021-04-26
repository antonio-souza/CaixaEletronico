package caixaeletronico.decorator;

public class CemReais extends CedulaImpl {

  public CemReais() {
    super();
  }

  public CemReais(Cedula cedula) {
    super(cedula);
  }
  
  @Override
  public void contar(Integer valor) {
    this.proibirValorMenorQueDez(valor);
    super.contar(valor);
  }

  @Override
  protected Integer getValor() {
    return 100;
  }

  @Override
  protected String getNome() {
    return "cem";
  }

  private void proibirValorMenorQueDez(Integer valor) {
    if (valor < 10) {
      throw new IllegalArgumentException("Informe um valor maior ou igual a 10.");
    }
  }
}
