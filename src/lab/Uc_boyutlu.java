package lab;

public abstract class Uc_boyutlu 
{
   private String isim;

public Uc_boyutlu(String isim) 
{
	super();
	this.isim = isim;
}

public String getIsim() 
{
	return isim;
}

public void setIsim(String isim) 
{
	this.isim = isim;
}
abstract void alanHesapla();
abstract void hacimHesapla();
}
