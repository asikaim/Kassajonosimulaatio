package vt4_Asikainen;

public class AsiakasJono<E>
	implements JonoInterface<E>{
private E[] asiakkaat;
int count;

public AsiakasJono(){
  this.asiakkaat = (E[]) ((Object[])new Object[1]);
  this.count = -1;
}

public void lisaaElementti(E paramE){
  if (this.count < 0) {
    this.count = 0;
  }
  if (this.count < this.asiakkaat.length){
    this.asiakkaat[(this.count++)] = paramE;
  }
  else{
    Object[] arrayOfObject = (Object[])new Object[10 + this.asiakkaat.length];
    System.arraycopy(this.asiakkaat, 0, arrayOfObject, 0, this.asiakkaat.length);
    this.asiakkaat = (E[]) arrayOfObject;
    this.asiakkaat[(this.count++)] = paramE;
  }
}

public E palautaElementti(){
  if (this.count < 0) {
    return null;
  }
  Object localObject = this.asiakkaat[0];
  this.count -= 1;
  Object[] arrayOfObject = (Object[])new Object[10 + this.asiakkaat.length - 1];
  System.arraycopy(this.asiakkaat, 1, arrayOfObject, 0, this.asiakkaat.length - 1);
  this.asiakkaat = (E[]) arrayOfObject;
  return (E)localObject;
}

public boolean onkoJonoTyhja(){
  if (this.count <= 0) {
    return true;
  }
  return false;
}

public boolean onkoJonoOlemassa(){
  if (this.asiakkaat != null) {
    return false;
  }
  return true;
}
}