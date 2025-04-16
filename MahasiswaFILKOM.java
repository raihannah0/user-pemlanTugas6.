package modul6;

public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, boolean jenisKelamin, String nik, boolean menikah, String nim, double ipk) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getStatus() {
        String angkatan = "20" + nim.substring(0, 2);
        char prodiCode = nim.charAt(6);
        String prodi = switch (prodiCode) {
            case '2' -> "Teknik Informatika";
            case '3' -> "Teknik Komputer";
            case '4' -> "Sistem Informasi";
            case '6' -> "Pendidikan Teknologi Informasi";
            case '7' -> "Teknologi Informasi";
            default -> "Tidak diketahui";
        };
        return prodi + ", " + angkatan;
    }

    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk <= 3.5) return 50;
        else if (ipk > 3.5 && ipk <= 4.0) return 75;
        else return 0;
    }

    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    public String toString() {
        return super.toString() +
               "\nNIM: " + nim +
               "\nIPK: " + ipk +
               "\nStatus: " + getStatus();
    }
}
