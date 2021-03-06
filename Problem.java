import java.util.*;
import java.io.*;

public class Problem {
    public static void main(String[] args) throws IOException {
        //BufferedReader to take input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0) {
            //Store the user input. The input should be unique characters or integers.
            String[] input = br.readLine().trim().split(" ");
            Solution sol = new Solution();
            String str = sol.longestCommonPrefix(input,input.length);
        }
        br.close();
    }
}

class Solution {
    String longestCommonPrefix(String[] input,int n) {
        String temp = "";
        boolean flag = true;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if(input[i].length() > input[j].length()) {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp; 
                }
            }
        }
        int j = input[0].length();
        while(j > 0) {
            for(int i=1;i<n;i++) {
                if(!(input[0].substring(0,j)).equals(input[i].substring(0,j))) {
                    flag = false;
                    break;
                }
            }
            if(!flag) {
                j=j-1;
                flag = true;
            } else
                break;
        }
        if(j != 0)
            return "-1";
        return input[0].substring(0,j);     
    }
}