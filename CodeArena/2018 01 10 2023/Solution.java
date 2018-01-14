import java.io.*;
public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader in = new InputStreamReader (System.in);
    	BufferedReader br = new BufferedReader(in);		
        int N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++)
        {
            String[] arr = br.readLine().split(" ");
            for (int j=arr.length-1; j>=0; j--)
                System.out.print(arr[j]+" ");
            System.out.println("");
        }
        br.close();
    }
}
