package modul6;

import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMsk;
    private int jumlahAnak;

    public Pekerja(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMsk, int jumlahAnak) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMsk = tahunMsk;
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        int tahunBekerja = LocalDate.now().getYear() - tahunMsk.getYear();
        if (tahunBekerja <= 5) return 0.05 * gaji;
        else if (tahunBekerja <= 10) return 0.10 * gaji;
        else return 0.15 * gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public double getPendapatan() {
        return super.getPendapatan() + getBonus() + getGaji() + (jumlahAnak * 20);
    }

    public String toString() {
        return super.toString() +
               "\nTahun Masuk: " + tahunMsk.getDayOfMonth() + " " + tahunMsk.getMonthValue() + " " + tahunMsk.getYear() +
               "\nJumlah Anak: " + jumlahAnak +
               "\nGaji Total: " + getGaji();
    }
}
