package soal2;

public class Negara {
    private String namaNegara;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalMerdeka;
    private int bulanMerdeka;
    private int tahunMerdeka;

    Negara(String namaNegara, String jenisKepemimpinan, String namaPemimpin, int tanggalMerdeka, int bulanMerdeka, int tahunMerdeka) {
        this.namaNegara = namaNegara;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalMerdeka = tanggalMerdeka;
        this.bulanMerdeka = bulanMerdeka;
        this.tahunMerdeka = tahunMerdeka;
    }

    public String getNamaNegara() { return namaNegara; }
    public String getJenisKepemimpinan() { return jenisKepemimpinan; }
    public String getNamaPemimpin() { return namaPemimpin; }
    public int getTanggalMerdeka() { return tanggalMerdeka; }
    public int getBulanMerdeka() { return bulanMerdeka; }
    public int getTahunMerdeka() { return tahunMerdeka; }

    public static String kapitalisasi(String kata) {
        return kata.substring(0, 1).toUpperCase() + kata.substring(1);
    }
}
