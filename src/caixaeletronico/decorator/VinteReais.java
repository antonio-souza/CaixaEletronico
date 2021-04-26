package caixaeletronico.decorator;

public class VinteReais extends CedulaImpl {

  public VinteReais() {
    super();
  }

  public VinteReais(Cedula cedula) {
    super(cedula);
  }

  @Override
  protected Integer getValor() {
    return 20;
  }

  @Override
  protected String getNome() {
    return "vinte";
  }
}
