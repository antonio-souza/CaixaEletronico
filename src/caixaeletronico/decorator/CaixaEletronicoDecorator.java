package caixaeletronico.decorator;

public class CaixaEletronicoDecorator {
  
  public static void main(String[] args) {
    
    Integer valor = 380;
    System.out.println("Valor: " + valor);
    System.out.println(new Saque(valor));
    
    valor = 390;
    System.out.println("Valor: " + valor);
    System.out.println(new Saque(valor));
    
    valor = 310;
    System.out.println("Valor: " + valor);
    System.out.println(new Saque(valor));
    
    valor = 311;
    System.out.println("Valor: " + valor);
    System.out.println(new Saque(valor));        
  }
}


