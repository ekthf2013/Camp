//문제1번 100부터 200사이 숫자를 랜덤으로 10개 배열에 저장하고 평균을 출력
public class num_1 {
    public static void main(String[] args) {
        int sum = 0;
        int arr[] = new int [10];
        for (int i = 0; i < 10; i ++){
            int num = (int)(Math.random() * 100) + 100;
            arr[i] = num;
            sum += arr[i];
            //System.out.println(arr[i]);
        }
        System.out.print("배열의 평균 값은 " + sum/10 + "입니다.");
    }
}