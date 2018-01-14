import java.io.*;
public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader in = new InputStreamReader (System.in);
    	BufferedReader br = new BufferedReader(in);		
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int[] nums = new int[N];
        for (int i=0; i<N; i++)
            nums[i] = Integer.parseInt(arr[i]);
        int M = Integer.parseInt(br.readLine());
        for (int i=0; i<M; i++)
        {
            int X = Integer.parseInt(br.readLine());
            for (int j=0; j<N; j++)
            {
                if (nums[j] > X)
                    nums[j] -= 1;
            }
        }
        for (int i=0; i<N; i++)
            System.out.print(nums[i]+" ");
        br.close();
    }
}
