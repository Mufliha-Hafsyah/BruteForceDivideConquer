package minggu5;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input nilai yang akan dicari faktorialnya
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        //menampilkan hasil pemanggilan method
        Faktorial fk = new Faktorial();
        System.out.println("Nilai faktorial "+nilai+
            " menggunakan BF: "+fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial "+nilai+
            " menggunakan DC: "+fk.faktorialDC(nilai));
    }
    

}
