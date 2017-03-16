import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        int l = 0;
        while(l != k){
            int tmp = a[0];
            for(int j = 0; j < n - 1; j++){
                a[j] = a[j + 1];
            }
            a[n - 1] = tmp;
        l++;
        }
        
        // This works, but formatting is incorrect 
        
        // System.out.println(Arrays.toString(a));
        
        // Same for this line as well!!!
        for(int m = 0; m < n; m++)
           System.out.printf("%d ", a[m]);
    }
}
