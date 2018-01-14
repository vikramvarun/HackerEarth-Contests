import java.io.*;
import java.util.*;
class Main 
{
	public static void main(String[] args) throws IOException 
    {
        InputStreamReader in = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader(in);
        String[] nq = br.readLine().split(" ");
        int N = Integer.parseInt(nq[0]);
        int Q = Integer.parseInt(nq[1]);
        String[] Ti = br.readLine().split(" ");
        String[] Mi = br.readLine().split(" ");
        int[] time = new int[N];
        long total = 0;
        for (int i=0; i<N; i++ )
        {
            time[i] = Integer.parseInt(Ti[i]);
            total += (long) time[i];
        }
        Arrays.sort(time);
        for (int i=0; i<Q; i++)
        {
            int K = Integer.parseInt(br.readLine());
            long result = 0;
            if (K < N/2)
            {
                for (int j=N-1; j>=N-K; j--)
                    result += (long) time[j];
            }
            else 
            {
                for (int j=0; j<N-K; j++)
                    result += (long) time[j];
                result = total - result;
            }
            System.out.println(result);
        }
        br.close();
	}
}  
