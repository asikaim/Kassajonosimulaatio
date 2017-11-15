package vt4_Asikainen;

class KateisAsiakas
	extends Asiakas{
private KateisMaksu p;

public KateisAsiakas(double paramDouble){
  this.p = new KateisMaksu(paramDouble);
}

public KateisMaksu getMaksu(){
  return this.p;
}
}
