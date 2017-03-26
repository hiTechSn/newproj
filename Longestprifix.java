import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Longestprifix {

    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in) );
        String s=br.readLine();
        int n=Integer.parseInt(s);
        if(n<0)
            System.out.println("0");
        else{
        String str[]=new String[n];
        for(int i=0;i<str.length;i++){
            str[i]=br.readLine();
        }
        System.out.println(longprifix(str, 0, str.length-1).length());
        }
        
    }
    public static String prifix(String s,String s2){
        String t="";int i=0,j=0;
        while(i<s.length() && j<s2.length()){
            if(s.charAt(i)==s2.charAt(i))
                t+=s.charAt(i);
        }
        return t;
    }
    public static String longprifix(String str[],int l,int r){
        //int l=0,r=str.length-1;
      
       if(l<=r){
          
           int mid=l+(r-l)/2;
           String s1=longprifix(str, l, mid);
           String s2=longprifix(str, mid+1, r);
           return prifix(s1, s2);
       }
       return null;
    }
    
}
