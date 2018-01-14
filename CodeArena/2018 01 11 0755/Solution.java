import java.io.*;
public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader in = new InputStreamReader (System.in);
    	BufferedReader br = new BufferedReader(in);		
        int T = Integer.parseInt(br.readLine());
        for (int i=0; i<T; i++)
        {
            String[] arr = br.readLine().split(" ");
            int N = Integer.parseInt(arr[0]);
            int D = Integer.parseInt(arr[1]);
            int R = Integer.parseInt(arr[2]);
            while (R-- > 0) 
            {
                N = N % D;
                N = N * 10;
            }
            int result = N / D;
            System.out.println(result);
        }
        br.close();
    }
} 
