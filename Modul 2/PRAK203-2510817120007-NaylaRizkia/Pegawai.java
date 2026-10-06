package praktikum2.soal3;

// salah nama class, tidak sesuai nama file
// public class Employee {
public class Pegawai {
    public String nama;
//    tipe data tidak sesuai, harusnya string bukan char
//    public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

//    kurang parameter j
//    public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}
