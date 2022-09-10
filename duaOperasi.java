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
        double inputSatu;
        double inputDua;

        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Masukkan Angka Pertama Kemudian Tekan <Enter>");

            while (!scanner.hasNextDouble()) {
                System.out.println("Please, enter double");
                scanner.next();

            }
            inputSatu = scanner.nextDouble();

            System.out.println("Masukkan Operator (+, -, *, /) lalu Tekan <Enter>");

            operator = scanner.next();

            while (!(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/"))) {
                System.out.println("Silahkan Masukkan Operator (+, -, *, /)");
                operator = scanner.next();
            }
        }
    }
}


