import java.util.Scanner;

public class num_23 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        String arr[] = {"가위", "바위","보"};
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        while (true) {
            int num = (int)(Math.random() * 2);
            System.out.print("가위 바위 보!!>>");
            String player = scn.next();
            if (player.equals("가위")) {
                System.out.print("사용자= " + player + " , 컴퓨터 = " + arr[num] + " ");
                if(num==0) System.out.println("비겼습니다.");
                else if(num==1) System.out.println("컴퓨터가 이겼습니다.");
                else System.out.println("사용자가 이겼습니다.");
            }
            else if (player.equals("바위")){
                System.out.print("사용자= " + player + " , 컴퓨터 = " + arr[num] + " ");
                if(num==0) System.out.println("사용자가 이겼습니다.");
                else if(num==1) System.out.println("비겼습니다.");
                else System.out.println("컴퓨터가 이겼습니다.");
            }
            else if(player.equals("보")){
                System.out.print("사용자= " + player + " , 컴퓨터 = " + arr[num] + " ");
                if(num==0) System.out.println("컴퓨터가 이겼습니다.");
                else if(num==1) System.out.println("사용자가 이겼습니다.");
                else System.out.println("비겼습니다.");
            }
            else if (player.equals("그만")) {
                System.out.println("게임을 종료합니다...");
                break;
            }
            else System.out.println("다시 입력하시오.");
        }
    }
}
