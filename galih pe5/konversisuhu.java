import java.util.Scanner;


public class konversisuhu {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
    
        //ini input data
        System.out.print("Masukkan celcius:");
        float celcius=input.nextFloat();


        //hitung
        float reamur = (float)(4/5)*celcius;
        float fahrenheit = (float)9/5*celcius+32;

        //cetak
        System.out.println("Celcius:"+ celcius);
        System.out.println("Reamur:"+ reamur);
        System.out.println("Fahrenheit:"+ fahrenheit);
        
        input.close();
    }
}
