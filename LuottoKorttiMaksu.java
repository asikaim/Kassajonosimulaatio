package vt4_Asikainen;
import java.io.PrintStream;

class LuottoKorttiMaksu
  extends Maksu{
  private String korttiNro;
  
  public LuottoKorttiMaksu(double paramDouble, String paramString){
    super(paramDouble);
    this.korttiNro = paramString;
  }
  
  public void printMaksuTiedot(){
    System.out.println("   Luottokorttimaksu kortilla: " + this.korttiNro);
    super.printMaksuTiedot();
  }
}

