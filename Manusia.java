package modul6;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public double getTunjangan() {
        if (menikah) {
            return jenisKelamin ? 25 : 20;
        } else {
            return 15;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() {
        return "Nama: " + nama +
               "\nNIK: " + nik +
               "\nJenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan") +
               "\nPendapatan: " + getPendapatan();
    }
}
