package caixaeletronico.decorator;

import java.util.List;

public class Saque {

  private Cedula cedulas;
  
  public Saque(Integer valor) {
    this.cedulas = criarCedulas();    
    cedulas.contar(valor);
  }
  
  public List<Cedula> listarCelulas() { 
    return this.cedulas.listar();
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    this.cedulas.listar().forEach(c -> sb.append(c).append("\n"));
    return sb.toString();
  } 
  
  private static synchronized Cedula criarCedulas() {
    Cedula cedula = new DezReais();
    cedula = new VinteReais(cedula);
    cedula = new CinquentaReais(cedula);
    cedula = new CemReais(cedula);
    return cedula;
  }
}
