public class Java0201 {
    public  static String toLowerCase(String sc){
        char[] scs = sc.toCharArray();
        for(int i = 0;i<scs.length;i++){
            if(scs[i]>='A'&&scs[i]<='Z'){
                scs[i]+=32;
            }else if(scs[i]>='a'&&scs[i]<='z'){
                scs[i]-=32;
            }
        }
        String str = String.valueOf(scs);
        return str;
    }
public static void main(String[] args){
    String sc = "addscskUU";
    System.out.println(toLowerCase(sc));
}

    }
