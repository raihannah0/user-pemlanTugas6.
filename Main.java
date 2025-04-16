package modul6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("TESTCASE MANUSIA");
        // 1a. Laki-laki telah menikah
        Manusia a = new Manusia("Dino", true, "123", true);
        System.out.println(a + "\n");

        // 1b. Perempuan telah menikah
        Manusia manusia2 = new Manusia("Inul", false, "456", true);
        System.out.println(manusia2 + "\n");

        // 1c. Belum menikah
        Manusia manusia3 = new Manusia("Cio", true, "238", false);
        System.out.println(manusia3 + "\n");


        System.out.println("TESTCASE MAHASISWA FILKOM");
        // 2a. IPK < 3
        MahasiswaFILKOM mhs1 = new MahasiswaFILKOM("Farhan", true, "1111", false, "245150211111111", 2.8);
        System.out.println(mhs1 + "\n");

        // 2b. IPK 3 – 3.5
        MahasiswaFILKOM mhs2 = new MahasiswaFILKOM("Raisya", false, "2222", false, "245150322222222", 3.4);
        System.out.println(mhs2 + "\n");

        // 2c. IPK 3.5 – 4
        MahasiswaFILKOM mhs3 = new MahasiswaFILKOM("Irfan", true, "3333", false, "245150433333333", 4);
        System.out.println(mhs3 + "\n");


        System.out.println("TESTCASE PEKERJA");
        // 3a. Lama bekerja 2 tahun, anak 2
        Pekerja pekerja1 = new Pekerja("Mulyadi", true, "4444", true, 300000, LocalDate.now().minusYears(2), 2);
        System.out.println(pekerja1 + "\n");

        // 3b. Lama bekerja 9 tahun, tanpa anak
        Pekerja pekerja2 = new Pekerja("Layla", false, "5555", true, 400000, LocalDate.now().minusYears(9), 0);
        System.out.println(pekerja2 + "\n");

        // 3c. Lama bekerja 20 tahun, anak 10
        Pekerja pekerja3 = new Pekerja("Lucas", true, "6666", true, 500000, LocalDate.now().minusYears(20), 10);
        System.out.println(pekerja3 + "\n");


        System.out.println("TESTCASE MANAGER");
        // 4. Manager, lama bekerja 15 tahun, gaji 7500
        Manager manager1 = new Manager("Jennifer", false, "7777", true, 7500, LocalDate.now().minusYears(15), 3, "HRD");
        System.out.println(manager1 + "\n");
    }
}