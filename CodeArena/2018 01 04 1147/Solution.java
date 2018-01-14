import java.io.*;
class Main 
{
	public static void main(String[] args) throws IOException 
    {
        InputStreamReader in = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader(in);
		int T = Integer.parseInt(br.readLine());
		for (int t=0; t<T; t++)
		{
		    long N = Long.parseLong(br.readLine());
		    if (N%3 == 0)
		        N = N/3;
		    else if (N < 3)
		        N = 1;
		    System.out.println(N);
		}
        br.close();
	}
} 
