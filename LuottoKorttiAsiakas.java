package vt4_Asikainen;

class LuottoKorttiAsiakas
	extends Asiakas{
private LuottoKorttiMaksu p;

public LuottoKorttiAsiakas(double paramDouble, String paramString){
  this.p = new LuottoKorttiMaksu(paramDouble, paramString);
}

public LuottoKorttiMaksu getMaksu(){
  return this.p;
}

public void printAsiakasTiedot(){
  super.printAsiakasTiedot();
  this.p.printMaksuTiedot();
}
}