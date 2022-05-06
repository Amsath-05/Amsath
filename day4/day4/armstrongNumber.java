package week1.day4;

public class armstrongNumber {
    public static void main(String[] args) {
        int num = 370;
        int temp = num, r, sum = 0;

        while (num > 0) {

            r = num % 10;
            num /= 10;
            sum = sum + r * r * r;

        }
        if(temp==sum){
            System.out.println("its a armstrong");
        }else{
            System.out.println("its not a armostrong");
        }
    }
}
