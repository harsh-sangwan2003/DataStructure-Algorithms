import java.util.Scanner; 

/**
 * pattern8
 */
public class pattern8 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("\t");
            }
            
            System.out.print("*");
            System.out.println();
        }
        scn.close();
    }
}