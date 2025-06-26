import java.util.Scanner;


public class persegipanjang {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
    
        //ini input data
        System.out.print("Masukkan panjang:");
        double panjang=input.nextDouble();

        System.out.print("Masukkan Lebar:");
        double Lebar = input.nextDouble();

        //hitung
        double luas = panjang*Lebar;
        double keliling = 2*(panjang+Lebar);

        //cetak
        System.out.println("Luas Persegi Panjang:"+ luas);
        System.out.println("Luas Persegi Panjang:"+ keliling);
        
        input.close();
    }
}
