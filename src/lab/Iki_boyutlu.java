package lab;

public abstract class Iki_boyutlu 
{
	 private String isim;

	public Iki_boyutlu(String isim) 
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
    
}
