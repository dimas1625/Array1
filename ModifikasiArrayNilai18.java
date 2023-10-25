import java.util.Scanner;

public class ModifikasiArrayNilai18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Masukkan nilai akhir ke-" + i + " : ");
            nilaiAkhir[i] = sc.nextInt();
        }

        for (int j = 0; j < 10; j++) {
            if (nilaiAkhir[j] > 70) {
                System.out.println("Mahasiswa ke-" + j + " lulus!");
            } else {
                System.out.println("Mahasiswa ke-" + j + " tidak lulus!");
            }
        }
    }
}
