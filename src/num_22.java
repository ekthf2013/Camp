import java.util.InputMismatchException;
import java.util.Scanner;

public class num_22 {
    public static void main(String args[]) {
        while (true) {
            try {
                String day[] = {"일", "월", "화", "수", "목", "금", "토"};
                System.out.print("정수를 입력하세요>>");
                Scanner scn = new Scanner(System.in);
                int num = scn.nextInt();
                int index = num % 7;
                System.out.println(day[index]);
            } catch (InputMismatchException e) {
                System.out.println("경고! 수를 입력하지 않았습니다.");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("프로그램 종료합니다...");
                break;
            }
        }
    }
}
