import java.util.Scanner;
public class HW4 {
     static void putChar(char c, int n){
        while(n-- > 0){
            System.out.print(c);
        }
    }

    static void putStar(int m){
        putChar('*', m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단수는: ");
        int num = sc.nextInt();
        for(int i = 1; i <= num; i++){
            putStar(i);
            System.out.println();
        }
    }
}
