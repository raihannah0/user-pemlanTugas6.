package modul6;

import java.time.LocalDate;

public class Manager extends Pekerja {
    private String departemen;

    public Manager(String nama, boolean jenisKelamin, String nik, boolean menikah, double gaji, LocalDate tahunMsk, int jumlahAnak, String departemen) {
        super(nama, jenisKelamin, nik, menikah, gaji, tahunMsk, jumlahAnak);
        this.departemen = departemen;
    }
    
    public double getPendapatan() {
        double tunjanganManager = 0.1 * super.getGaji();
        return super.getPendapatan() + tunjanganManager;
    }

    public String toString() {
        return super.toString() +
               "\nDepartemen: " + departemen;
    }
}
    

