package vt4_Asikainen;
import java.io.PrintStream;
import java.util.Random;

public class JonoMain{
  public static void main(String[] paramArrayOfString)
    throws InterruptedException{
    Random localRandom = new Random();
    int i = 10 + localRandom.nextInt(100);
    
    AsiakasJono localAsiakasJono = new AsiakasJono();
    for (int m = 0; m < i; m++){
      int k = localRandom.nextInt(2);
      switch (k){
      case 0: 
        int j = localRandom.nextInt(2);
        switch (j){
        case 0: 
          localAsiakasJono.lisaaElementti(new LuottoKorttiAsiakas(localRandom.nextInt(1000), new Integer(Math.abs(localRandom.nextInt())).toString()));
          System.out.println("Asiakas lisatty jonoon");
          break;
        case 1: 
          localAsiakasJono.lisaaElementti(new KateisMaksuAsiakas(localRandom.nextInt(1000)));
          System.out.println("Asiakas lisatty jonoon");
        }
        break;
      case 1: 
        if (!localAsiakasJono.onkoJonoTyhja()){
          Asiakas localAsiakas2 = (Asiakas)localAsiakasJono.palautaElementti();
          
          System.out.println("Asiakas alkaa maksaa ostoksiaan: ");
          Thread.sleep(localRandom.nextInt(3000));
          tulostaAsiakas(localAsiakas2);
        }
        else{
          System.out.println("Jono on tyhja");
        }
        break;
      }
    }
    if (!localAsiakasJono.onkoJonoTyhja()){
      System.out.println("\n\nUUSIA ASIAKKAITA EI OTETA ENEMPAA\n");
      while (!localAsiakasJono.onkoJonoTyhja()){
        Asiakas localAsiakas1 = (Asiakas)localAsiakasJono.palautaElementti();
        System.out.println("Asiakas alkaa maksaa ostoksiaan: ");
        Thread.sleep(localRandom.nextInt(5000));
        tulostaAsiakas(localAsiakas1);
      }
    }
  }
  
  private static void tulostaAsiakas(Asiakas paramAsiakas){
    System.out.println("   Asiakas: ");
    paramAsiakas.printAsiakasTiedot();
    System.out.println("   maksoi ostoksen");
  }
}
