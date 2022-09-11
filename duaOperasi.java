package PerhitunganDuaOperasi;
import java.util.*;

/*
[1] [2] [3] [4]

[1] Menunjukkan banyaknya operasi yang akan dihitung

[2] Kode operator :
    1 adalah operasi penjumlahan
    2 adalah operasi pengurangan
    3 adalah operasi perkalian

[3] dan [4] Merupakan operan-operan yang akan dioperasikan
 */

public class duaOperasi {
    public static void main(String[] args) {

        String operator;
        int inputSatu;
        int inputDua;

        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Masukkan Angka Pertama Kemudian Tekan <Enter>");

            while (!scanner.hasNextInt()) {
                System.out.println("Please, enter double");
                scanner.next();

            }
            inputSatu = scanner.nextInt();

            System.out.println("Masukkan Operator (+, -, *, /) lalu Tekan <Enter>");

            operator = scanner.next();

            while (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))) {
                System.out.println("Silahkan Masukkan Operator (+, -, *, /)");
                operator = scanner.next();
            }
            System.out.println("Masukkan Angka Kedua Kemudian Tekan <Enter>");

            while (!scanner.hasNextInt()) {
                System.out.println("Please, enter double");
                scanner.next();

            }
            inputDua = scanner.nextInt();

            switch (operator) {
                case "+" -> {
                    System.out.print("hasil = ");
                    System.out.println(inputSatu + inputDua);
                }
                case "-" -> {
                    System.out.print("hasil =");
                    System.out.println(inputSatu - inputDua);
                }
                case "*" -> {
                    System.out.print("hasil =");
                    System.out.println(inputSatu * inputDua);
                }
                case "/" -> {
                    System.out.print("hasil =");
                    if (inputDua == 0) {
                        System.out.println("ukuran tak terbatas");
                    } else {
                        System.out.println(inputSatu / inputDua);
                    }
                }
            }

            System.out.println("tekan <y> untuk melanjutkan");
        

        }
    }
}


