package vt4_Asikainen;
import java.io.PrintStream;

class KateisMaksu
	extends Maksu{
	public KateisMaksu(double paramDouble){
    super(paramDouble);
  }
  
  public void printMaksuTiedot(){
    System.out.println("   Kateismaksu : ");
    super.printMaksuTiedot();
  }
}