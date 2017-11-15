package vt4_Asikainen;

class KateisMaksuAsiakas
	extends Asiakas{
private KateisMaksu p;

public KateisMaksuAsiakas(double paramDouble){
  this.p = new KateisMaksu(paramDouble);
}

public KateisMaksu getMaksu(){
  return this.p;
}

public void printAsiakasTiedot(){
  super.printAsiakasTiedot();
  this.p.printMaksuTiedot();
}
}