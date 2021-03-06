import java.util.Scanner;

public class frequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);

        scn.close();
    }

    public static int getDigitFrequency(int n, int d) {
        
        int count = 0;
        
        while(n!=0)
        {
            int last = n%10;
            if(last==d)
            count++;
            
            n/=10;
        }
        
        return count;
    }
}