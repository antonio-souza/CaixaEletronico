package caixaeletronico.decorator;

public class CinquentaReais extends CedulaImpl {

  public CinquentaReais() {
    super();
  }

  public CinquentaReais(Cedula cedula) {
    super(cedula);
  }

  @Override
  protected Integer getValor() {
    return 50;
  }

  @Override
  protected String getNome() {
    return "cinquenta";
  }
}
