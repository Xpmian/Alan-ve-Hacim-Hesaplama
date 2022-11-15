package lab;

public class TetraHedron extends Uc_boyutlu
{
  private int birinci_dik_kenar;
  private int ikinci_dik_kenar;
  private int ucuncu_kenar;
  private int yukselik;

public TetraHedron(String isim, int birinci_dik_kenar, int ikinci_dik_kenar, int ucuncu_kenar, int yukselik) 
{
	super(isim);
	this.birinci_dik_kenar = birinci_dik_kenar;
	this.ikinci_dik_kenar = ikinci_dik_kenar;
	this.ucuncu_kenar = ucuncu_kenar;
	this.yukselik = yukselik;
}
public int getBirinci_dik_kenar() {
	return birinci_dik_kenar;
}
public void setBirinci_dik_kenar(int birinci_dik_kenar) {
	this.birinci_dik_kenar = birinci_dik_kenar;
}
public int getIkinci_dik_kenar() {
	return ikinci_dik_kenar;
}
public void setIkinci_dik_kenar(int ikinci_dik_kenar) {
	this.ikinci_dik_kenar = ikinci_dik_kenar;
}
public int getUcuncu_kenar() {
	return ucuncu_kenar;
}
public void setUcuncu_kenar(int ucuncu_kenar) {
	this.ucuncu_kenar = ucuncu_kenar;
}
public int getYukselik() {
	return yukselik;
}
public void setYukselik(int yukselik) {
	this.yukselik = yukselik;
}
@Override
void alanHesapla() 
{
	double yan_alan = yukselik*(birinci_dik_kenar+ikinci_dik_kenar+ucuncu_kenar);
	double taban_alan = (birinci_dik_kenar*ikinci_dik_kenar)/2.0;
	double tum_alan = (taban_alan*2)+yan_alan;
	System.out.println(getIsim()+"'nin alani: "+tum_alan);
	
}
void hacimHesapla()
{
	double taban_alan = (birinci_dik_kenar*ikinci_dik_kenar)/2.0;
	double hacim = (taban_alan)*yukselik;
	System.out.println(getIsim()+"'nin hacmi: "+hacim);
}
  
  
}
