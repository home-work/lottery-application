import java.util.Random;
import java.util.Scanner;

public class LotteryApplication {
    public static void main(String[] args) {
        //Random 1 số có 2 chữ số
        Random random = new Random();
        int lottery = random.nextInt(100);

        //Nhập vào 2 chữ số của giải
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chữ số đầu tiên của giải: ");
        int guessDigit1 = scanner.nextInt();
        System.out.println("Nhập vào chữ số thứ hai của giải: ");
        int guessDigit2 = scanner.nextInt();

    }
}
