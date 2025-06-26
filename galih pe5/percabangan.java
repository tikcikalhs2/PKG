import java.util.Scanner;


public class percabangan {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
    
        //ini input data
        System.out.print("Masukkan Nilai UN");
        double nilai = input.nextDouble();

        //hitung

        if (nilai>=0 && <=60){
            System.out.println("Tidak Lulus");
        }
        else if (nilai>=61 && <=75){
            System.out.println("Cadangan");
       }

        else if (nilai>=75 && <=100){
            System.out.println("Lulus");
       }

        //cetak
       
        input.close();
    }
}
