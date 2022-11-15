package lab;

public class Ucgen extends Iki_boyutlu
{
  private int a;
 

public Ucgen(String isim, int a) 
{
	super(isim);
	this.a = a;
}


public int getA() 
{
	return a;
}


public void setA(int a) 
{
	this.a = a;
}


@Override
void alanHesapla() 
{
	double b = Math.sqrt(3);
	double alan = (a*a)*(b)/4;	
	System.out.println(getIsim()+"'nin alani: "+alan);
	
}
}
