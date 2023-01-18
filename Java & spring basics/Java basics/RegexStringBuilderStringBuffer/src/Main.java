public class Main {
    public static void main(String[] argv) throws Exception {
        StringBuffer sb = new StringBuffer("Udacity Course");
        String sb2 = sb.toString();// Now original string is changed
        System.out.println(sb);
        System.out.println(A.vowelOnly(sb2));
    }

}
