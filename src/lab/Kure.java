package lab;

public class Kure extends Uc_boyutlu
{
  private int yari_cap;

public Kure(String isim, int yari_cap) 
{
	super(isim);
	this.yari_cap = yari_cap;
}

public int getYari_cap() 
{
	return yari_cap;
}

public void setYari_cap(int yari_cap)
{
	this.yari_cap = yari_cap;
}

@Override
void alanHesapla() 
{
	double alan = 4*(3.14)*(yari_cap*yari_cap);
	System.out.println(getIsim()+"'nin alani: "+alan);
	
}
void hacimHesapla()
{
	double hacim = (4/3)*(3.14)*(yari_cap*yari_cap*yari_cap);
	System.out.println(getIsim()+"'nin hacmi: "+hacim);
}


}
  

