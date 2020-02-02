public class Java0201 {
    public String toLowerCase(String str) {
        StringBuilder sBuilder = new StringBuilder();
        for(int i = 0;i<str.length();i++) {
            char t  =str.charAt(i);
            if(t>=65 && t<=90) {
                char temp = (char)(t+32);
                sBuilder.append(temp);
            }else {
                sBuilder.append(t);
            }
        }
        return sBuilder.toString();
    }
    public static void main(String[] args){

    }
}
