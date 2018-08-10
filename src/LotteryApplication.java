import java.util.Random;

public class LotteryApplication {
    public static void main(String[] args) {
        //Random 1 số có 2 chữ số
        Random random = new Random();
        int lottery = random.nextInt(100);
    }
}
