package vt4_Asikainen;
import java.io.PrintStream;
import java.util.Random;

class Asiakas{
  public int asiakasNro;
  
  public Asiakas(){
    Random localRandom = new Random();
    this.asiakasNro = localRandom.nextInt(1000);
  }
  
  public void printAsiakasTiedot(){
    System.out.println("   Asiakasnumero: " + this.asiakasNro);
  }
}
