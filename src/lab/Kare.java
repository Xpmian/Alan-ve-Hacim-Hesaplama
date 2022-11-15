package lab;

public class Kare extends Iki_boyutlu
{
  private int kenar;

public Kare(String isim, int kenar)
{
	super(isim);
	this.kenar = kenar;
}

public int getKenar() 
{
	return kenar;
}

public void setKenar(int kenar) 
{
	this.kenar = kenar;
}

@Override
void alanHesapla() 
{
	double alan=(kenar*kenar);
	System.out.println(getIsim()+"'nin alani: "+alan);
	
	
}

}
