package soal1;
import java.util.Random;

public class Dadu {
    private int nilaiDadu;

    Dadu() { acakNilai(); }

    public void acakNilai() {
        Random num = new Random();
        nilaiDadu = num.nextInt(6) + 1;
    }

    public int getNilaiDadu() { return nilaiDadu; }
}