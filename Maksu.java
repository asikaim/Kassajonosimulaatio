package vt4_Asikainen;
import java.io.PrintStream;

class Maksu{
  protected double maara;
  
  public Maksu(double paramDouble){
    this.maara = paramDouble;
  }
  
  public void printMaksuTiedot(){
    System.out.println("   Maksun maara: " + this.maara);
  }
}
