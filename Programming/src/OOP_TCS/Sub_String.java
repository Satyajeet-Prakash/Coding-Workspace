package OOP_TCS;

import java.io.*;
import java.util.*;

public class Sub_String {
    
    public static int subString(String str, int n ,String ex)
    {
        int ans = 0;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i+1; j <= n; j++)
            {
               
                String res = str.substring(i, j);
                if(res.contains(ex))
                {
                    ans++;
                    System.out.println(res);
                }
            }
        }
        return ans;
    }
 
    public static void main(String[] args) throws IOException
    {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String st = br.readLine();
        st = st.replaceAll("\\s", ""); 
        String[] str = st.split(",");
        System.out.println(subString(str[0], str[0].length(), str[1]));
    }
}
