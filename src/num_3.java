
import java.util.Scanner;
public class num_3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int arr1 [] = new int [10];
        int arr2 [] = new int [10];
        System.out.println("첫 번째 배열을 입력하시오.");
        for(int i = 0; i<arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }
        System.out.println("두 번째 배열을 입력하시오.");
        for(int i = 0; i<arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }

        System.out.println("두 배열은 " + equallnt(arr1, arr2));
    }
    public static String equallnt(int arr1[], int arr2[]){
        int cnt = 0;
        String eqallnt;
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr2.length; j++){
                if(arr1[i] == arr2[j])
                    cnt++;
            }
        }
        if(cnt==arr1.length)
            eqallnt = "같습니다.";
        else eqallnt = "다릅니다.";

        return eqallnt;
    }
}
