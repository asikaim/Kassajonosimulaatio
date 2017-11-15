package vt4_Asikainen;

public abstract interface JonoInterface<E>
{
  public abstract void lisaaElementti(E paramE);
  
  public abstract E palautaElementti();
  
  public abstract boolean onkoJonoTyhja();
  
  public abstract boolean onkoJonoOlemassa();
}
