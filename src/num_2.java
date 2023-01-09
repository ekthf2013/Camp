//비어있지 않은 정수 배열이 입력되었을 때, 배열 내 존재하는 모든 숫자는 단 하나의 숫자만 제외하고 모두 두번 나타난다. 이 때 중복되지 않는 하나의 숫자를 출력
import java.util.Arrays;
import java.util.Scanner;

public class num_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("배열의 크기를 입력하시오.");
        int index = scn.nextInt();
        int [] arr = new int[index];
        int i;
        System.out.println("배열의 입력값을 띄어쓰기를 활용하여 입력하시오.");
        for(i = 0; i<index; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("결과: " + singleNumber(arr));
    }
    public static int singleNumber(int[] nums){
        int cnt;
        int num = 0;
        for(int i = 0; i<nums.length; i++){
            cnt = 0;
            int tempA = nums[i];
            for(int j = 0; j<i; j++){
                if(nums[i]==nums[j])
                    cnt++;
            }
            if(cnt==0)
                num = nums[i];
        }
        return num;
    }
}
