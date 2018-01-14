import java.io.*;
class Main 
{
	public static void main(String[] args) throws IOException 
    {
        InputStreamReader in = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader(in);
		String[] nk = br.readLine().split(" ");
		int N = Integer.parseInt(nk[0]);
		int K = Integer.parseInt(nk[1]);
        String[] x = br.readLine().split(" ");
        String[] y = br.readLine().split(" ");
        long result = 0;
        for (int i=0; i<K; i++)
        {
            int xC = Integer.parseInt(x[i]);
            int yC = Integer.parseInt(y[i]);
            int C1 = (xC-1) + (yC-1);
            int C2 = (xC-1) + (N-yC);
            int C3 = (N-xC) + (yC-1);
            int C4 = (N-xC) + (N-yC);
            result += (long) Math.min(C1, Math.min(C2, Math.min(C3, C4)));
        }
        System.out.println(result);
        br.close();
	}
} 
