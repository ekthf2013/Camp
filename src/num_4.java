import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class num_4 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("정답을 입력하시오.");
        int target = scn.nextInt();
        System.out.println("베열의 크기를 입력하시오.");
        int index = scn.nextInt();
        int[] arr = new int[index];
        int i;
        System.out.println("배열의 입력값을 띄어쓰기를 활용하여 입력하시오.");
        for(i = 0; i<index; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println("결과: " + Arrays.toString(twoSum(arr,target)));
    }
    public static int[] twoSum(int[] nums, int target){
        int num = 0;
        int a = 0;
        int b = 0;
        for(int i = 0; i<nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    num = 0;
                    num = nums[i] + nums[j];
                    if (num == target) {
                        if (a < b) {
                            a = i;
                            b = j;
                        } else {
                            b = i;
                            a = j;
                        }
                    }
                }
            }
        }
        int answer [] = new int[2];
        answer[0] = a;
        answer[1] = b;

        return answer;
    }
}
