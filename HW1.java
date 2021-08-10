import java.util.Scanner;
public class HW1{
    static int med(int a, int b, int c){
        if (a >= b){
            if (b >= c){
                return b;
            }else if(a <= c){
                return a;
            }else{
                return c;
            }
        }else if(a > c){
            return a;
        }else if(b < c){
            return b;
        }else{
            return c;
        }
    }  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.print("3개의 숫자 입력: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("중앙값은 "+ med(num1, num2, num3));

    }
}