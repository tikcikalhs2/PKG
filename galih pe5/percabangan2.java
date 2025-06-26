import java.util.Scanner;


public class percabangan2 {
    double gajipokok=0;
    double tunjangananak=0;
    double tunjanganistri=0;
    double totalgaji=0;
    double pph;
    double pendapatangaji;
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //input
        System.out.print("Masukkan nama Karyawan:");
        String nama=input.nextLine();
        
        System.out.print("JK:");
        String jk=input.nextLine();

        System.out.print("Gol:");
        String Gol=input.nextLine();

        System.out.print("Jumlah anak:");
        int jmlanak=input.nextInt();

        //proses

        

        if (Gol == "A"){
            gajipokok=600000;
            
        }
        else if (Gol == "B"){
            gajipokok=800000;
        }
        else if (Gol == "C"){
            gajipokok=1200000;
        }
       
        if (jk=="laki"){
            tunjanganistri=(float)3/4*gajipokok;
        }
        else if (jk=="perempuan"){
            tunjanganistri=0;
        }


        if (jmlanak==1){
            tunjangananak=300000;
        }
        else if (jmlanak==2){
            tunjangananak=300000*2;
        }

        else{
            tunjangananak=800000;
        }

        totalgaji=gajipokok+tunjanganistri+tunjangananak;
        pph=0.05*gajipokok;


        //cetak
        
        input.close();
    }
}
