package minggu5;

public class MainNilaiMahasiswa17 {
    public static void main(String[] args) {
        String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
        String[] nim = {"220101001", "220101002", "220101003", "220101004", "220101005", "220101006", "220101007", "220101008"};
        int[] tahunMasuk = {2022, 2022, 2021, 2021, 2023, 2020, 2023, 2020};
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};

        NilaiMahasiswa17[] mahasiswa = new NilaiMahasiswa17[nama.length];

        // Mengisi array dengan objek NilaiMahasiswa17
        for (int i = 0; i < nama.length; i++) {
            mahasiswa[i] = new NilaiMahasiswa17(nama[i], nim[i], tahunMasuk[i], nilaiUTS[i], nilaiUAS[i]);
        }

        // Mengambil nilai UTS dan UAS dari objek untuk diproses
        int[] arrUTS = new int[mahasiswa.length];
        int[] arrUAS = new int[mahasiswa.length];

        for (int i = 0; i < mahasiswa.length; i++) {
            arrUTS[i] = mahasiswa[i].nilaiUTS;
            arrUAS[i] = mahasiswa[i].nilaiUAS;
        }

        NilaiMahasiswa17 nilai = new NilaiMahasiswa17("", "", 0, 0, 0);

        System.out.println("Nilai UTS tertinggi: " + nilai.cariMaxUTS(arrUTS, 0, arrUTS.length - 1));
        System.out.println("Nilai UTS terendah: " + nilai.cariMinUTS(arrUTS, 0, arrUTS.length - 1));
        System.out.println("Rata-rata nilai UAS: " + nilai.hitungRata2UAS(arrUAS));
    }
}
