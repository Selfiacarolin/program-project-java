import java.util.Scanner;
public class project {

  public static void main(String[] args)throws Exception {
    String data[]={"selvia","29092002"};
    String nama,sandi;
    System.out.print("===============");
    System.out.print("==PROJECT JAVA==");
    System.out.println("===============");
Scanner apa=new Scanner(System.in);//class yang menyediakan fungsi untuk mengambil input dari keyboard
    System.out.print("Nama Pengguna : ");
    nama=apa.nextLine();
    System.out.print("Sandi Pengguna : ");
    sandi=apa.nextLine();
 
 System.out.println();
    System.out.println("*********************************************");
    System.out.println("=============SELAMAT DATANG==================");
    System.out.println("*********************************************");

  	int a,b,c;
		 for(int h=1;h<=25;h++){
   	System.out.print(" =");
   }
   System.out.println();
   for(a=1;a<=5;a++){
     
     System.out.print("\t");
     for(b=1;b<=5;b++){
       if(b==1||b==5||a==5){
         Thread.sleep(200);
         System.out.print(" *");
       }else{
         System.out.print("  ");
       }
     }
      System.out.print("  ");
     for(c=1;c<=5;c++){
       if(a==1||a==3||c==1||c==5){
         Thread.sleep(200);
         System.out.print(" *");
       }else{
         System.out.print("  ");
       }
     }
     System.out.print("  ");
       for(c=1;c<=5;c++){
       if(a==1||a==3||a==5||c==1&&a<3||c==5&&a>3){
         Thread.sleep(200);
         System.out.print(" *");
       }else{
         System.out.print("  ");
       }
     }
    
     System.out.println();
   }
   for(int h=1;h<=25;h++){
   	System.out.print(" =");
   }
   System.out.println();
   System.out.println();
   System.out.print("NAMA LENGKAP \t: SELFIA CAROLIN PASARIBU\n");
   System.out.print("NIM \t\t: 202013013\n");
   System.out.print("MATA KULIAH\t: ALGORITMA DAN PEMOGRAMAN\n");
   System.out.print("PRODI \t\t: TEKNIK INFORMATIKA\n");
   System.out.print("KELAS \t\t: 1A 2020\n");
   System.out.println();
   System.out.println("Press enter to continue...");try{        System.in.read();}catch(Exception e){	e.printStackTrace();}

   System.out.println();
    System.out.println("*********************************************");
    System.out.println("APLIKASI PROGRAM MENGHITUNG LUAS BANGUN DATAR");
    System.out.println("*********************************************");
  int jumlah,i,j, swap,pilih,lagi,jari_jari;
  Scanner scan = new Scanner(System.in);
 
 
  int array[] = {3,5,1,4,2,8,7,6,};
  String list[]={"Luas Persegi Panjang","Luas Lingkaran","Luas Persegi","Luas Trapesium","Luas Jajar Genjang","Luas LayangLayang","Luas Segitiga","Luas Belah Ketupat"};

  for(i=0; i<(array.length-1);i++)
  {
   for(j=0;j<array.length-i-1;j++)
   {
    if (array[j] > array[j+1])
    {
     swap = array[j];
     array[j] = array[j+1];
     array[j+1]=swap;{}
    }
   }
  }

  
  for(i=0;i<array.length; i++){
   System.out.println(array[i]+". "+list[i]);
  }
  pil:
  for(;;){
  
  System.out.print("\nPilih Rumus Yang Diinginkan : ");
  pilih=scan.nextInt();
  
  System.out.print("Pilihan Rumus Anda No :"+pilih);
  System.out.println();
  switch (pilih){
    case 1:
    int panjang, lebar, luaspersegipanjang, bil, hasil;
    System.out.println();
    System.out.println("===============================");
    System.out.println("Menghitung Luas Persegi Panjang");
    System.out.println("===============================");
    System.out.print("Masukkan panjang : ");
    panjang=scan.nextInt();
    System.out.print("Masukkan lebar : ");
    lebar=scan.nextInt();
    luaspersegipanjang=panjang*lebar;
    System.out.println("Luas Persegi Panjang : "+luaspersegipanjang);
    System.out.println();
    System.out.println("-------------");
    System.out.println("Contoh soal");
    System.out.println("-------------");
    System.out.print("Sebuah persegi panjang mempunyai panjang "+panjang+" cm dengan lebar "+lebar+" cm. \nMaka hitunglah Luas dari Persegi Panjang tersebut!\n");
    System.out.print("Jawab : \n");
    System.out.print("luaspersegipanjang = panjang x lebar\nluaspersegipanjang = "+panjang+"x"+lebar+"\nluaspersegipanjang = "+luaspersegipanjang+"cm persegi\n");
    break;
    case 2:
    double luas,phi=3.14;
    int r;
    System.out.println();
    System.out.println("=========================");
    System.out.println("Menghitung Luas Lingkaran");
    System.out.println("=========================");
    System.out.print("Masukkan jari-jari Lingkaran : ");
    r=scan.nextInt();
    luas=phi*r*r;
    System.out.print(String.format("%.2f", luas));
    System.out.println();
    break;
    case 3:
    System.out.println();
    System.out.println("=======================");
    System.out.println("Menghitung Luas Persegi");
    System.out.println("=======================");
    System.out.print("Masukkan contoh angka bilangan bulat : ");
    bil=scan.nextInt();
    hasil=bil*bil;
    System.out.println();
    System.out.println("-------------");
    System.out.println("Contoh soal");
    System.out.println("-------------");
    System.out.print("Jika diketahui sebuah persegi yang memiliki sisi persegi "+bil+" cm. \nMaka hitunglah Luas dari Persegi tersebut!\n");
    System.out.print("Jawab : \n");
    System.out.print("Luas = sisi x sisi\nLuas = "+bil+"x"+bil+"\nLuas = "+hasil+"cm persegi\n");
    break;
    case 4:
    int tinggi,rusuk ;
    System.out.println();
    System.out.println("=========================");
    System.out.println("Menghitung Luas Trapesium");
    System.out.println("=========================");
    System.out.print("Masukkan tinggi trapesium : ");
    tinggi=scan.nextInt();
    System.out.print("Masukkan rusuk sejajar trapesium : ");
    rusuk=scan.nextInt();
    double tg= tinggi,rs=rusuk,hasil2;  
    hasil2=0.5*rs*tg;
    System.out.println();
    System.out.println("-------------");
    System.out.println("Contoh soal");
    System.out.println("-------------");
    System.out.print("Terdapat sebuah bangun datar trapesium dengan tinggi "+tinggi+"cm dengan jumlah rusuk sejajar "+rusuk+"cm. \nMaka hitunglah Luas dari Trapesium tersebut!\n");
    System.out.print("Jawab : \n");
    System.out.print("Luas = 1/2 x jumlah rusuk sejajar x tinggi\nLuas = 1/2 x "+rusuk+" x "+tinggi+"\nLuas = "+hasil2+" cm persegi\n");
    break;
    case 5:
    int alasjg, tinggijg, luasjajargenjang;
    System.out.println();
    System.out.println("============================");
    System.out.println("Menghitung Luas Jajargenjang");
    System.out.println("============================");
    System.out.print("Masukkan alas jajar genjang : ");
    alasjg=scan.nextInt();
    System.out.print("Masukka tinggi jajar genjang : ");
    tinggijg=scan.nextInt();
    luasjajargenjang=alasjg*tinggijg;
    System.out.println();
    System.out.println("-------------");
    System.out.println("Contoh soal");
    System.out.println("-------------");
    System.out.print("Sebuah jajar genjang memiliki alas "+alasjg+" cm dan tinggi "+tinggijg+" cm. \nHitunglah Luas Jajar Genjang tersebut!\n");
    System.out.print("Jawab : \n");
    System.out.print("luasjajargenjang = alas x tinggi\nluasjajargenjang = "+alasjg+"x"+tinggijg+"\nluasjajargenjang = "+luasjajargenjang+"cm persegi\n");
    break;
    case 6:
    System.out.println();
    System.out.println("============================");
    System.out.println("Menghitung Luas Layanglayang");
    System.out.println("============================");
    int diagonally1,diagonally2 ;
    System.out.println("Luas Layanglayang");
    System.out.print("Masukkan diagonal1 layanglayang : ");
    diagonally1=scan.nextInt();
    System.out.print("Masukkan diagonal2 layanglayang : ");
    diagonally2=scan.nextInt();
    double dl1= diagonally1,dl2=diagonally2;  
    hasil2=0.5*dl1*dl2;
    System.out.println();
    System.out.println("-------------");
    System.out.println("Contoh soal");
    System.out.println("-------------");
    System.out.print("Diketahui sebuah bangun datar layang-layang memiliki panjang diagonal 1 "+diagonally1+"cm dan diagonal 2 "+diagonally2+"cm. \nHitung Luas Layang-layang tersebut!\n");
    System.out.print("Jawab : \n");
    System.out.print("Luas = 1/2 x diagonal1 x diagonal2\nLuas = 1/2 x "+diagonally1+" x "+diagonally2+"\nLuas = "+hasil2+" cm persegi\n");
    break;
    case 7:
    int alas, t;
    double luassegitiga;
    System.out.println();
    System.out.println("========================");
    System.out.println("Menghitung Luas Segitiga");
    System.out.println("========================");
    System.out.print("Masukkan alas segitiga : ");
    alas=scan.nextInt();
    System.out.print("Masukkan tinggi segitiga : ");
    t=scan.nextInt();
    luassegitiga=0.5*alas*t;
    System.out.println("Luas Segitiga : "+luassegitiga);
    System.out.println();
    System.out.println("-------------");
    System.out.println("Contoh soal");
    System.out.println("-------------");
    System.out.print("Diketahui sebuah segitiga dengan panjang alas"+alas+" cm dan tinggi "+t+" cm. \nHitunglah Luas Segitiga tersebut!\n");
    System.out.print("Jawab : \n");
    System.out.print("luassegitiga = 1/2 x alas x tinggi\nluassegitiga = 1/2 x "+alas+"x"+t+"\nluassegitiga = "+luassegitiga+"cm persegi\n");
    break;
    case 8:
    System.out.println();
    System.out.println("=============================");
    System.out.println("Menghitung Luas Belah Ketupat");
    System.out.println("=============================");
    int diagonal1,diagonal2;
    System.out.print("Masukkan diagonal1 Belah Ketupat : ");
    diagonal1=scan.nextInt();
    System.out.print("Masukkan diagonal2 Belah Ketupat : ");
    diagonal2=scan.nextInt();
    double d1= diagonal1,d2=diagonal2;  
    hasil2=0.5*d1*d2;
    System.out.println();
    System.out.println("-------------");
    System.out.println("Contoh soal");
    System.out.println("-------------");
    System.out.print("Diketahui sebuah bangun datar belah ketupat yang memiliki panjang diagonal1 "+diagonal1+"cm dan diagonal2 "+diagonal2+"cm. \nHitung luas Belah Ketupat tersebut!\n");
    System.out.print("Jawab : \n");
    System.out.print("Luas = 1/2 x diagonal1 x diagonal2\nLuas = 1/2 x "+diagonal1+" x "+diagonal2+"\nLuas = "+hasil2+" cm persegi\n");
    break;
    default :
   continue pil;
   
  }
  System.out.print("Apakah Anda Ingin Mencoba lagi? (1:0)");
  lagi=scan.nextInt();
  System.out.println();
  if(lagi==1){
    continue pil;
  }else{
    System.out.println();
    System.out.println("=======******************======");
    System.out.println("Terima Kasih Selamat Mencoba");
    System.out.println("=======******************======");
    System.exit(0); 
  }
  break;
  }
  }
} 