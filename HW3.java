import java.util.Scanner;
public class HW3 {
    public void printSeason(int m){
        if (m == 12 || m == 1 || m == 2){
            System.out.println("겨울");
        }else if(m == 3 || m == 4 || m == 5){
            System.out.println("봄");
        }else if(m == 6 || m == 7 || m == 8){
            System.out.println("여름");
        }else if(m == 9 || m == 10 || m == 11){
            System.out.println("가을");
        }else{
            System.out.println("그런 월은 없습니다.");
        }


        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 월입니까?(1 ~ 12): ");
        HW3 HW = new HW3();
        int num = sc.nextInt();
        HW.printSeason(num);
    }
}
