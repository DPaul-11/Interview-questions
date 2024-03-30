import java.util.*;
import java.lang.*;
import java.io.*;
public class Pcs1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while(t>0)
        {
            int n = Integer.parseInt(br.readLine());
            String s =br.readLine();
            String ans = "";
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='A')
                    ans = ans+'T';
                else if (s.charAt(i)=='T')
                    ans = ans+'A';
                else if (s.charAt(i)=='G')
                    ans = ans+'C';
                else if (s.charAt(i)=='C')
                    ans = ans+'G';

            }
            System.out.println(ans);
            t--;
        }
    }
}
