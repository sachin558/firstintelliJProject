/*
write the program if
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Solution {
    static void firstNorepeating(String str){
        int []charCount=new int [26];
        Queue<Character> q=new LinkedList<Character>();
        for(int  i=0;i<str.length();i++){
            char ch=str.charAt(i);
            q.add(ch);
            charCount[ch -'a']++;
            while(!q.isEmpty()){
                if(charCount[q.peek() - 'a']>1){
                    q.remove();
                }
                else{
                    System.out.print(q.peek()+" ");
                    break;
                }
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        String str=s.next();
        firstNorepeating(str);
    }
}

