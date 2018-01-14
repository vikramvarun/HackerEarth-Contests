import java.io.*;
import java.math.*;
class TestClass 
{
    public static void main(String args[] ) throws Exception 
    {
        InputStreamReader in = new InputStreamReader(System.in); 
        BufferedReader br = new BufferedReader(in);
        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++)
        {
            int num = Integer.parseInt(br.readLine());
            BigInteger n = BigInteger.valueOf(num);
            BigInteger n1 = BigInteger.valueOf(num-1);
            BigInteger n2 = BigInteger.valueOf(2*num-1);
            BigInteger div = BigInteger.valueOf(1000000007);
            BigInteger four = BigInteger.valueOf(4);
            BigInteger six = BigInteger.valueOf(6);
            BigInteger one = BigInteger.valueOf(1);
            BigInteger two = BigInteger.valueOf(2);
            BigInteger min = n.multiply(n1).multiply(n1);
            min = min.divide(four);
            min = min.mod(div);
            BigInteger max = n.multiply(n1).multiply(n2);
            max = max.divide(six);
            max = max.mod(div);
            System.out.println(min+" "+max);
        }   
    }
}
