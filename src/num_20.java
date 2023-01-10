import java.util.Scanner;

public class num_20 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("돈의 액수를 입력하세요>>");
        int money = scn.nextInt();
        int a = money/50000;
        money = money%50000;
        int b = money/10000;
        money = money%10000;
        int c = money/1000;
        money = money%1000;
        int d = money/500;
        money = money%500;
        int e = money/100;
        money = money%100;
        int f = money/10;
        money = money%10;
        int g = money;

        System.out.println("오만원" + a + "개," + "만원" + b + "개," + "천원" + c + "개," + "500원" + d + "개," + "100원" + e + "개," + "10원" + f + "개," + "1원" + g + "개");

    }
}
