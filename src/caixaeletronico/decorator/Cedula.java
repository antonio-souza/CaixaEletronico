package caixaeletronico.decorator;

import java.util.List;

public interface Cedula {

  public void contar(Integer valor);
  
  public List<Cedula> listar();
  
  public String toString();
}
