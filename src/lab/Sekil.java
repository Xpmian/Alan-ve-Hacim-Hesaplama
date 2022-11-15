package lab;

import java.util.Scanner;

public abstract class Sekil 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		String islemler ="Islemler..\n"
				        +"1-> Daire alani hesapla\n"
				        +"2-> Kare alani hesapla\n"
				        +"3-> Ucgen alani hesapla\n"
				        +"4-> Kupun alanini ve hacmi hesapla\n"
				        +"5-> Kurenin alanini ve hacmi hesapla\n"
				        +"6-> Ucgen Prizma alanini ve hacmi hesapla\n"
		                +"Cikis : q";
		 while(true)
	        {
	        	System.out.println(islemler);
	        	System.out.println("Hangi seklin alanini hesaplamak istersiniz.");
	        	String sekil_turu = sc.nextLine();
	        	if(sekil_turu.equals("q"))
	        	{
	        		System.out.println("Sistem cikiyorsunuz...");
	        		break;
	        	}
	        	if(sekil_turu.equals("1"))
	        	{
	        		System.out.println("Dairenin yaricapini giriniz.");
	        		int a = input.nextInt();
	        		Daire daire1 = new Daire("Daire",a);
	        		daire1.alanHesapla();
	        	}
	        	if(sekil_turu.equals("2"))
	        	{
	        		System.out.println("Kare bir kenar uzunlugunu giriniz.");
	        		int a = input.nextInt();
	        		Kare kare1 = new Kare("Kare",a);
	        		kare1.alanHesapla();
	        	}
	        	if(sekil_turu.equals("3"))
	        	{
	        		System.out.println("Ucgenin ilk kenarini giriniz");
	        		int a = input.nextInt();
	        		System.out.println("Ucgenin ikinci kenarini giriniz");
	        		int b = input.nextInt();
	        		System.out.println("Ucgenin ucunu kenarini giriniz");
	        		int c = input.nextInt();
	        		Ucgen ucgen1 = new Ucgen("Ucgen",a);
	        		ucgen1.alanHesapla();
	        	}
	        	if(sekil_turu.equals("4"))
	        	{
	        		System.out.println("Kupun bir kenarini giriniz.");
	        		int a= input.nextInt();
	        		Kup kup1 = new Kup("Kup",a);
	        		kup1.alanHesapla();
	        		kup1.hacimHesapla();
	        	}
		        if(sekil_turu.equals("5"))
		        {
		        	System.out.println("Kurenin yaricapini giriniz.");
		        	int a = input.nextInt();
		        	Kure kure1 = new Kure("Kure",a);
		        	kure1.alanHesapla();
		        	kure1.hacimHesapla();
		        }
		        if(sekil_turu.equals("6"))
		        {
		        	System.out.println("Birinci dik kenari giriniz..");
		        	int a = input.nextInt();
		        	System.out.println("ikinci dik kenari giriniz..");
		        	int b = input.nextInt();
		        	System.out.println("ucuncu kenari giriniz..");
		        	int c = input.nextInt();
		        	System.out.println("Yukseligini giriniz.");
		        	int d = input.nextInt();
		        	TetraHedron tetra = new TetraHedron("Ucgen",a,b,c,d);
		        	tetra.alanHesapla();
		        	tetra.hacimHesapla();
		        	
		        }
		
		
		
		
		
		
    }
}
}
