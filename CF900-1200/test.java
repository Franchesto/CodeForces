import java.util.*;
public class test{
  static Scanner sc;
  public static void solve(){
    HashSet<String> h=new HashSet<>();
    int n=sc.nextInt();
    String a[]=new String[n];
    for(int i=0;i<n;i++){String k=sc.next(); h.add(k); a[i]=k;}
    for(int i=0;i<n;i++){
      int flag=0;
      for(int j=1;j<a[i].length();j++){
        if(h.contains(a[i].substring(0,j)) &&  h.contains(a[i].substring(j))){
            System.out.println(a[i].substring(0,j));
            System.out.println(a[i].substring(j) + " -");
          flag=1;
          break;
        }
      }
      if(flag==1);
       flag=0;
    }
    System.out.println();
  }
  public static void main(String args[]){
      sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t-->0) solve();
  }
}