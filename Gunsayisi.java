import java.util.Scanner;

class Helloworld {

	
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		//Kullanıcıdan alınacak tarihlerin tanımlanması.
		int ilktarih[]=new int[3];
		int ikincitarih[]=new int[3];
	
		// Kullanıcıdan ilk tarihin gün ay yıl şeklinde alınması
			System.out.println("İlk tarihin gününü giriniz : ");
			ilktarih[0]=reader.nextInt();
			while(ilktarih[0]>=1 && ilktarih[0]<=31!=true) {
				System.out.println("Günler 1 ile 31 arasında olmak zorundadır.Lütfen geçerli bir gün giriniz :");
				ilktarih[0]=reader.nextInt();
				
			}
				
		System.out.println("İlk tarihin ayını giriniz : ");
		ilktarih[1]=reader.nextInt();
		while(ilktarih[1]>=1 && ilktarih[1]<=12!=true) {
			System.out.println("Aylar 1 ile 12 arasında olmak zorundadır.Lütfen geçerli bir ay giriniz :");
			ilktarih[1]=reader.nextInt();
		
		}
		
		System.out.println("İlk tarihin yılını giriniz : ");
		ilktarih[2]=reader.nextInt();
		
	// Kullanıcıdan ikinci tarihin alınması
	
		System.out.println("ikinci tarihin gününü giriniz : ");
		ikincitarih[0]=reader.nextInt();
		while(ikincitarih[0]>=1 && ikincitarih[0]<=31!=true) {
			System.out.println("Günler 1 ile 31 arasında olmak zorundadır.Lütfen geçerli bir gün giriniz :");
			ikincitarih[0]=reader.nextInt();
			
		}
			
	System.out.println("ikinci tarihin ayını giriniz : ");
	ikincitarih[1]=reader.nextInt();
	while(ikincitarih[1]>=1 && ikincitarih[1]<=12!=true) {
		System.out.println("Aylar 1 ile 12 arasında olmak zorundadır.Lütfen geçerli bir ay giriniz :");
		ikincitarih[1]=reader.nextInt();
	
	}
	
	System.out.println("ikinci tarihin yılını giriniz : ");
	ikincitarih[2]=reader.nextInt();
		
		//Verilen tarih için artık yılın hesaplanması
		//Mevcut yıl için artık yil kontrol edilecek mi kontrolü
		if(ilktarih[1]<=2)
		{
			ilktarih[2]--;
			
		}
		
		int artikyil1=ilktarih[2]/4 - ilktarih[2]/100 + ilktarih[2]/400;

		//Aynı işlemin ikinci tarih için yapılması
		
		if(ikincitarih[1]<=2)
		{
			ikincitarih[2]--;
			
		}
		
		int artikyil2=ikincitarih[2]/4 - ikincitarih[2]/100 + ikincitarih[2]/400;
		
		//Tarihler için 0/0/0 tarihinden itibaren toplam günlerin hesaplanması
		
		int totaldays1= ilktarih[2]*365 + ilktarih[0];
		
		
		int monthDays1[]= {31, 28, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
		
		for (int i=0;i<ilktarih[1]-1;i++)
		{
			totaldays1+=monthDays1[i];
		}
		
		int monthDays2[]= {31, 28, 31, 30, 31, 30,31, 31, 30, 31, 30, 31};
		
		int totaldays2=ikincitarih[2]*365 + ikincitarih[0];
		
		for (int i=0;i<ikincitarih[1]-1;i++)
		{
			totaldays2+=monthDays2[i];
		}
		
		totaldays1+=artikyil1;
		totaldays2+=artikyil2;
		
		
		
		// iki tarih arasındaki fark
		
		System.out.println("İki tarih arasındaki gün farkı "+(totaldays2-totaldays1));
		
	}
}
