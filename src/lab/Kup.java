package lab;

public class Kup extends Uc_boyutlu
{
    private int kenar;

	public Kup(String isim, int kenar) 
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
		double alan = 6*(kenar*kenar);
		System.out.println(getIsim()+"'nin alani:"+alan);
		
	}
	void hacimHesapla() 
	{
	   double hacim = kenar*kenar*kenar;
	   System.out.println(getIsim()+"'nin hacimi: "+hacim);
	}
	
		
	
    
}
