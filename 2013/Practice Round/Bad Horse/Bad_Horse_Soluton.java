import java.io.*;
import java.util.*;

class Bad_Horse{
  public static void main(String[] args) throws IOException{
  //  Stack<String> ls = new Stack<>();
  int ary[];
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 int testCases = Integer.parseInt(br.readLine());
 ary = new int[testCases];
 for(int i =1;i<=testCases;i++){
   HashSet<String> ls = new HashSet<>();
   int M = Integer.parseInt(br.readLine());
   String names;
   for(int j =1;j <=M;j++){
     names= br.readLine();
     StringTokenizer st = new StringTokenizer(names," ");
     while(st.hasMoreTokens()){
       ls.add(st.nextToken());
     }
   }
   int k=0;
   //System.out.println(ls);
   for (String str : ls ) {
     k++;
   }
  ary[i-1]=k;
 }
    String flag= "Yes";
 for(int i = 0;i<testCases;i++){
   if (ary[i]%2==0) {
     System.out.println("Case #"+(i+1)+": "+flag);
   }else {
     flag ="No";
     System.out.println("Case #"+(i+1)+": "+flag);

   }

 }

  }
}
