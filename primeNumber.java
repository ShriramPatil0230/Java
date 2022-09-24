import java.util.Scanner;
public class primeNumber {
    public static void main(String[] args) {
        Scanner sr= new Scanner(System.in);
        int n=sr.nextInt();
        int count=0;

        for(int i=1;i<=n;i++){
            if(n % i ==0){
                System.out.println(i);
                count=count + 1;
            }
        }
        if(count == 2){
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not a Prime Number");
        }
    }
}
