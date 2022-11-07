import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double mesafe;
        int yas,yolculukTipi;
        Scanner input=new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz: ");
        mesafe=input.nextDouble();
        System.out.print("Yaşınızı giriniz: ");
        yas=input.nextInt();
        if (mesafe<0 && yas <0)
            System.err.println("Hatalı veri girdiniz!");
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yolculukTipi=input.nextInt();
        if (yolculukTipi !=1 && yolculukTipi!=2)
            System.err.println("Hatalı veri girdiniz.");
        //-----------------------------------------------------------

        double tutar=mesafe*0.10;
        System.out.println("Bilet Fiyatı= "+tutar);

        //-----------------------------------------------------------
        double yasIndirimi=0;
        if (yas<12)
            yasIndirimi=tutar/2;
        else if (yas>=12 && yas<24)
            yasIndirimi=tutar-(tutar/10);
        else if (yas>=65)
            yasIndirimi=tutar-(tutar*3/10);
        else {
            System.out.println("Yaş indiriminden yararlanamıyorsunuz.");
            yasIndirimi = yasIndirimi;
        }
        //------------------------------------------------------------
        double indirimliBilet=0;
        if (yolculukTipi==2){
            indirimliBilet=yasIndirimi-(yasIndirimi/5);
        indirimliBilet=indirimliBilet*2;}
        System.out.println("İndirimli Bilet Fiyatınız: "+indirimliBilet);



    }
}
