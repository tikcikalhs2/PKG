import java.util.Scanner;


public class percabangan2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        //input
        System.out.print("Masukkan nama Karyawan:");
        string nama=input.nextLine();
        
        System.out.print("JK:");
       string jk=input.nextLine();

        System.out.print("Gol:");
        string Gol=input.nextLine();

        System.out.print("Jumlah anak:");
        int jmlanak=input.nextInt();

        //proses

        double gajipokok;
        double tunjangananak;
        double tunjanganistri;
        double totalgaji;
        double pph;
        double pendapatangaji;

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

        totalgaji=gajipokok+tunjanganistri+tunjangananak
        pph=(float)0.05*gajipokok
        
            



        input.close();
    }
}
