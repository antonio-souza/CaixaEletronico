package caixaeletronico.decorator;

import java.util.ArrayList;
import java.util.List;


public abstract class CedulaImpl implements Cedula {

  private Cedula cedula;

  private Integer quantidade;

  private Integer valorRestante;

  public CedulaImpl(Cedula cedula) {
    super();
    this.cedula = cedula;
  }

  public CedulaImpl() {
    super();
    this.cedula = null;
  }

  public void contar(Integer valor) {
    this.quantidade = 0;
    this.valorRestante = valor;
    this.contar();

    if (cedula != null) {
      cedula.contar(this.valorRestante);
    }
  }
  
  @Override
  public List<Cedula> listar() {
    List<Cedula> cedulas = new ArrayList<>();
    cedulas.add(this);
    if (cedula != null) {
      cedulas.addAll(cedula.listar());
    }    
    return cedulas;
  }

  private void contar() {
    if (valorRestante < this.getValor()) {
      return;
    }
    this.quantidade++;
    valorRestante -= this.getValor();
    this.contar();
  }
  
  @Override
  public String toString() {
    return String.format("%s cédulas(s) de %s reais.", quantidade, this.getNome());
  }

  protected Integer getValorRestante() {
    return valorRestante;
  }

  protected abstract Integer getValor();

  protected abstract String getNome();
}
