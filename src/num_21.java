import java.util.Scanner;

public class num_21 {
    public static void main(String args[]){
        int first = 0;
        int second = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("1~99 사이의 정수를 입력하세요>>");
        int num = scn.nextInt();
        if(num / 10 == 0){ //입력받은 정수가 한자리 수 일때
            if(num % 3 == 0)
                System.out.println("박수짝");
            else System.out.println("박수없음");
        }
        else {
            first = num/10;
            second = num%10;
            if(first % 3 == 0 && second % 3 == 0)
                System.out.println("박수짝짝");
            else if (first % 3 == 0 || second % 3 == 0)
                System.out.println("박수짝");
            else System.out.println("박수없음");
        }
    }
}
