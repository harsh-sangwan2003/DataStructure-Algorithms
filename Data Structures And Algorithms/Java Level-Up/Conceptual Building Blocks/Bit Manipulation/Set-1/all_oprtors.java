import java.util.*;

public class all_oprtors {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = scn.nextInt();
        int j = scn.nextInt();
        int k = scn.nextInt();
        int m = scn.nextInt();

        // write your code here
        int mask1 = (1 << i);
        int mask2 = ~(1 << j);
        int mask3 = (1 << k);
        int mask4 = (1 << m);

        System.out.println(n | mask1);
        System.out.println(n & mask2);
        System.out.println(n ^ mask3);

        int c = (n & mask4);

        if (c == 0)
            System.out.println("false");

        else
            System.out.println("true");

        scn.close();
    }

}