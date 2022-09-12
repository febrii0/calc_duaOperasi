package PerhitunganDuaOperasi;
import java.util.*;

/*
[0] [1] [2] [3]

[0] Menunjukkan banyaknya operasi yang akan dihitung

[1] Kode operator :
    1 adalah operasi penjumlahan
    2 adalah operasi pengurangan
    3 adalah operasi perkalian

[2] dan [3] Merupakan operan-operan yang akan dioperasikan
 */

public class duaOper {
    private static final Scanner input = new Scanner(System.in);
    private static int[] bil;

    public static void main(String[] args) {

        int jumOper = Integer.parseInt(args[0]);
        String oper = args[1];
        int in1 = Integer.parseInt(args[2]);
        int in2 = Integer.parseInt(args[3]);

        // Output dari hasil [1], [2], dan [3]
        System.out.println("Hasil = " + hasil(oper, in1, in2));


        // Menentukan banyaknya operasi yang akan dilakukan = [0]
        {
            System.out.println("Banyak operasi = " + jumOper);
            int n = input.nextInt();

            for (jumOper = Integer.parseInt(String.valueOf(0)); jumOper <= n - 1; jumOper++) {
                System.out.println("Jumlah operasi = " + jumOper);
                bil [jumOper] = input.nextInt();
            }
            for (jumOper = 0; jumOper <= n -1; jumOper++) {
                jumOper = jumOper + bil[Integer.parseInt(String.valueOf(jumOper))];
            }
            System.out.println("Jumlah operasi = " + jumOper);
        }
    }

    // Pemilihan operator yang akan digunakan [1]
    static int hasil(String c, int a, int b) {
        switch (c) {
            case "1":
                return a + b;

            case "2":
                return a - b;

            case "3":
                return a * b;

            default:
                System.out.println("Masukkan operator yang benar!");
                return 0;
        }
    }

}
