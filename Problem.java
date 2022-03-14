import java.util.*;
import java.io.*;

public class Problem {
    public static void main(String[] args) throws IOException {
        //BufferedReader to take input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0) {
            //Store the user input
            String[] input = br.readLine().trim().split(" ");
            int[] A = new int[input.length];
            for(int i=0;i<A.length;i++) {
                A[i] = Integer.parseInt(input[i]);
            }
            Solution.sortArray(A,A.length);
            for(int i : A) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        br.close();
    }
}

class Solution {
    static void sortArray(int[] A,int n) {
        Arrays.sort(A);
    }
}