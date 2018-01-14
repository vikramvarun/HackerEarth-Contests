import java.util.*;
class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char[] chArr1 = str.toCharArray();
        char[] chArr2 = str.toCharArray();
        int Q = s.nextInt();
        for (int i=0; i<Q; i++) 
        {
            int index = s.nextInt();
            index -= 1;
            String modS = s.next();
            char ch1 = modS.charAt(0);
            chArr1[index] = ch1;
            chArr2[index] = ch1;
        }
        int M = s.nextInt();
        for (int i=0; i<M; i++)
        {
            int l = s.nextInt();
            l -= 1;
            int r = s.nextInt();
            r -= 1;
            int count = (r + 1 - l)/2;
            for (int j=0; j<count; j++)
            {
                char temp = chArr2[l+j];
                chArr2[l+j] = chArr2[r-j];
                chArr2[r-j] = temp;
            }
        }
        for (int i=0; i<str.length(); i++)
            System.out.print(chArr1[i]);
        System.out.print("\n");
        int count = 0;
        for (int i=0; i<str.length(); i++)
        {
            System.out.print(chArr2[i]);
            if (chArr1[i] == chArr2[i])
                count++;
        }
        System.out.print("\n" + count);
    }
}
