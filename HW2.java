import java.util.Scanner;
public class HW2 {
    static int sumUp(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 X까지의 합을 구하자.");
        System.out.print("X의 값: ");
        int num = sc.nextInt();
        System.out.println("1부터 "+num+"까지의 합은 "+sumUp(num)+"입니다.");
    }
}
