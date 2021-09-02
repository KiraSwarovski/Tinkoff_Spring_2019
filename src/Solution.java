import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = "  I  don't  know.";


        int timesSpace = 0;
        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == ' '){
                timesSpace++;
                if(timesSpace < 2)
                    res += c;
            }else{
                res += c;
                timesSpace = 0;
            }
        }

        System.out.println(res.trim());
    }
}
