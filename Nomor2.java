import java.util.Scanner;
import java.util.ArrayList;

public class Nomor2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int hampers = input.nextInt();
        int packing = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
    public static double Nomor2 (ArrayList<Double> orderList) {
        double total = 0;
        for (double cost : orderList) {
            total += cost;
        }
        return total;
    }
    public static double calculateTotalWithTax(double total) {
        return total * 1.10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] HargaHampers= {150000, 175000, 200000};
        double[] HargaPacking = {50000, 75000, 125000};

        ArrayList<Double> orderList = new ArrayList<>();
        boolean continueInput = true;

        System.out.println("Halo!! Selamat datang di Toko Kue Rejeki!");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Pilih Paket Hampers dan Packing untuk Pesanan Anda!.");

        while (continueInput) {
            System.out.println("\nPilih Paket Hampers:");
            System.out.println("1. 2 Kue Kering dan 3 Kue Basah - Rp 150,000");
            System.out.println("2. 3 Kue Kering dan 2 Kue Basah - Rp 175,000");
            System.out.println("3. 3 Kue Kering dan 3 Kue Basah - Rp 200,000");
            System.out.print("Masukkan pilihan hampers [1/2/3]: ");
            int pilihanHampers = scanner.nextInt();

            if (pilihanHampers < 1 || pilihanHampers > 3) {
                System.out.println("Pilihan hampers tidak valid. Silakan coba lagi.");
                continue;
            }

            System.out.println("\nPilih Jenis Packing:");
            System.out.println("1. Pita - Rp 50,000");
            System.out.println("2. Kartu - Rp 75,000");
            System.out.println("3. Pita + Kartu - Rp 125,000");
            System.out.print("Masukkan pilihan packing [1/2/3]: ");
            int pilihanPacking = scanner.nextInt();

            if (pilihanPacking < 1 || pilihanPacking > 3) {
                System.out.println("Pilihan packing tidak valid. Silakan coba lagi:)).");
                continue;
            }

            double totalHarga = HargaHampers[pilihanHampers - 1] + HargaPacking[pilihanPacking - 1];
            orderList.add(totalHarga);

            System.out.print("Input lagi (Y/N)?: ");
            char lanjutMemilih= scanner.next().charAt(0);
            if (Character.toUpperCase(lanjutMemilih) != 'Y') {
                continueInput = false;
            }
        }
        double total = hargaHampers (orderList);
        double totalWithTax = calculateTotalWithTax(total);

        System.out.println("\nTotal hampers yang dipesan = " + orderList.size());
        System.out.println("Total yang harus dibayar = Rp " + totalWithTax);

        scanner.close();
    }
}

        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor2.class.getDeclaredMethods().length); 
    }
}
