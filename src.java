import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       int[] ch= new int[26];
            String str= s.nextLine().toLowerCase();
       char[] arr = (str.toCharArray());
       for(int i=0;i<26;i++)
    	   	ch[i]=0;
       for(int j=0;j<str.length();j++){
    	   //System.out.println(arr[j]-'0'-49);
    	   
    	   if(arr[j]!=' ')
    		   ch[(arr[j]-'0')-49]=ch[(arr[j]-'0')-49]+1;
    	   
       }
       int flag=1;
       for(int i=0;i<26;i++){
    	   if(ch[i]<=0){
    		   flag=0;    		   
    		   
    	   }
    		   
       }
       if(flag==1){
    	   System.out.println("pangram");
       }
       else
    	   	System.out.println("not pangram");
       
    }
}
