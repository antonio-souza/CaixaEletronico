package caixaeletronico.matematico;

public class CaixaEletronicoMatematico {
  
  private static CaixaEletronicoService caixaEletronicoService = new CaixaEletronicoService();
  
  public static void main(String[] args) {
    
    Integer valor = 380;
    System.out.println("Valor: " + valor);
    for (MassoDinheiro masso : caixaEletronicoService.sacar(valor)) {
      System.out.println(masso);
    }  
    valor = 390;
    System.out.println("Valor: " + valor);
    for (MassoDinheiro masso : caixaEletronicoService.sacar(valor)) {
      System.out.println(masso);
    }    
    valor = 310;
    System.out.println("Valor: " + valor);
    for (MassoDinheiro masso : caixaEletronicoService.sacar(valor)) {
      System.out.println(masso);
    }      
    valor = 311;
    System.out.println("Valor: " + valor);
    for (MassoDinheiro masso : caixaEletronicoService.sacar(valor)) {
      System.out.println(masso);
    }          
  }
}


