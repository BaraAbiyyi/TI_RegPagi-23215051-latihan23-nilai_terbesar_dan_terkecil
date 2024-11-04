package pertemuan5;
import java.util.Scanner;

public class latihan23 {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of students
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();

        // Create an array to store student scores
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];

        // Input student scores
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }

        // Initialize variables for the largest and smallest values
        int nilaiTerbesar = nilaiMahasiswa[0];
        int nilaiTerkecil = nilaiMahasiswa[0];

        // Find the largest and smallest values
        for (int i = 1; i < jumlahMahasiswa; i++) {
            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }
        }

        // Output the results
        System.out.println("Nilai terbesar adalah: " + nilaiTerbesar);
        System.out.println("Nilai terkecil adalah: " + nilaiTerkecil);
    }
}

