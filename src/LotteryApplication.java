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

        //Kiểm tra giải
        String giaiNhat= String.valueOf(lottery);
        String giaiNhi = new StringBuffer(giaiNhat).reverse().toString();
        System.out.println("Giải nhất: " + lottery);
        if (lottery < 10) {
            System.out.println("Giải nhì: 0" + giaiNhi);
        } else {
            System.out.println("Giải nhì: " + giaiNhi);
        }
        System.out.println("Giải ba: " + lottery / 10 + "\t" + lottery % 10 + "\n");
        if (lottery / 10 == guessDigit1 && lottery % 10 == guessDigit2) {
            System.out.println("Bạn đã trúng giải thưởng trị giá $10000 TRUMP");
        } else if (lottery / 10 == guessDigit2 && lottery % 10 == guessDigit1) {
            System.out.println("Bạn đã trúng giải thưởng trị giá $3000 TRUMP");
        } else if (lottery / 10 == guessDigit1 || lottery % 10 == guessDigit1 || lottery / 10 == guessDigit1 || lottery % 10 == guessDigit2) {
            System.out.println("Bạn đã trúng giải thưởng trị giá $1000 TRUMP");
        } else {
            System.out.println("Chúc bạn may mắn lần sau!");
        }
    }
}
