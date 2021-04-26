package caixaeletronico.decorator;

public class DezReais extends CedulaImpl {

  public DezReais() {
    super();
  }

  public DezReais(CedulaImpl cedula) {
    super(cedula);
  }
  
  @Override
  public void contar(Integer valor) {
    super.contar(valor);
    this.proibirValorNaoMultiploDeDez();
  }

  @Override
  protected Integer getValor() {
    return 10;
  }

  @Override
  protected String getNome() {
    return "dez";
  }

  private void proibirValorNaoMultiploDeDez() {
    if (super.getValorRestante() != 0) {
      throw new IllegalArgumentException("Informe um valor múltiplo de 10.");
    }
  }
}
