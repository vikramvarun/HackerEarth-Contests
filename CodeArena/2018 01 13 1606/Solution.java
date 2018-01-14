import java.io.*;
class Main 
{
    public static void main(String[] args) throws IOException 
    {
        InputStreamReader in = new InputStreamReader (System.in);
	    BufferedReader br = new BufferedReader(in);	        
        int T = Integer.parseInt(br.readLine()); 
        int[] arr = new int[26];
        for (int t=0; t<T; t++)
        {
            String str = br.readLine();
            int index = (int) str.charAt(0) - 97;
            arr[index] +=1;
        }
        int count = 0;
        for (int t=0; t<26; t++)
            count += (arr[t] + 9)/10;
        System.out.println(count);
        br.close();
	}
} 
