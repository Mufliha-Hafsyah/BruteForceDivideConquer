package minggu5;

 public class NilaiMahasiswa17 {
    String nama, nim;
    int tahunMasuk, nilaiUTS, nilaiUAS;

    NilaiMahasiswa17(String nama, String nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    int cariMaxUTS(int[] uts, int l, int r) {
        if (l == r) {
            return uts[l]; // base case
        }
        int mid = (l+r)/2;
        int maxl = cariMaxUTS(uts, l, mid);
        int maxr = cariMaxUTS(uts, mid+1, r);
        return Math.max(maxl, maxr);
    }

    int cariMinUTS(int[] uts, int l, int r) {
        if (l == r) {
            return uts[l]; // base case
        }
        int mid = (l+r)/2;
        int minl = cariMinUTS(uts, l, mid);
        int minr = cariMinUTS(uts, mid + 1, r);
        return Math.min(minl, minr);
    }

    double hitungRata2UAS(int[] uas) {
        double total = 0;
        for (int nilai : uas) {
            total += nilai;
        }
        return total / uas.length;
    }
}
