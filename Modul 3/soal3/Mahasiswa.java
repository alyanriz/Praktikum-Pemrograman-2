package soal3;

public class Mahasiswa {
    private String namaMahasiswa;
    private String nimMahasiswa;

    Mahasiswa(String namaMahasiswa, String nimMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
        this.nimMahasiswa = nimMahasiswa;
    }

    public String getNama() { return namaMahasiswa; }
    public String getNim() { return nimMahasiswa; }

    public static void menu() {
        System.out.println("\nMenu:\n" +
                "1. Tambah Mahasiswa\n" +
                "2. Hapus Mahasiswa berdasarkan NIM\n" +
                "3. Cari Mahasiswa berdasarkan NIM\n" +
                "4. Tampilkan Daftar Mahasiswa\n" +
                "0. Keluar");
    }
}
