import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type number N");
       int N = Integer.parseInt(br.readLine());
    //    int N = 4;   //for test
        System.out.println("Type matrix: ");
        int [][] array = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[N][N] = Integer.parseInt(br.readLine());
            }
        }
        System.out.println("Result: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println(Integer.toString(array[N][N])+"\t");
            }
            System.out.println();
        }
        


    }
}
