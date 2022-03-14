import java.util.*;
import java.io.*;

public class Problem {
    public static void main(String[] args) throws IOException {
        //BufferedReader to take input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-- > 0) {
            //Take user input
            String S = br.readLine().trim();
            String pat = br.readLine().trim();
            Solution sol = new Solution();
            ArrayList<Integer> results = sol.search(S,pat);
            if(results.size() > 0)
                for(Integer index : results) 
                    System.out.print(index + " ");
            else
                System.out.print(-1);
            System.out.println();            
        }
        br.close();
    }
}

class Solution {
    ArrayList<Integer> search(String S,String pat) {
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        int temp = 0;
        while(S.substring(temp).contains(pat)) {
            temp=S.indexOf(pat,temp);
            temp = temp + 1;
            indexes.add(temp);
        }
        return indexes;
    }
}