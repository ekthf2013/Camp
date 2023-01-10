import java.util.Scanner;

public class num_10 {
    public static void main(String args[]) {
        int step = 1;
        int first = 0;
        int last = 99;
        int num = (int) (Math.random() * 100);
        System.out.println("수를 결정하였습니다. 맞추어 보세요\n" + first + "-" + last);
        Scanner scn = new Scanner(System.in);
        while (true) {
            for (int i = 0; i < 100; i++) {
                System.out.println(step + ">>");
                step++;
                int a = scn.nextInt();
                if (a > num) {
                    System.out.println("더 낮게\n" + first + "-" + a);
                    if (last > a)
                        last = a;
                } else if (a < num) {
                    System.out.println("더 높게\n" + a + "-" + last);
                    if (first < a)
                        first = a;
                } else if (a == num) {
                    System.out.println("맞았습니다.");
                    System.out.println("다시하겠습니까 (y/n)>>");
                    String restart = scn.next();
                    if (restart.equals("y")) {
                        step = 1;
                        first = 0;
                        last = 99;
                        num = (int) (Math.random() * 100);
                    }
                    else if (restart.equals("n")) {
                        System.out.println("종료합니다.");
                        break;
                    }
                }
            }
        }
    }
}
