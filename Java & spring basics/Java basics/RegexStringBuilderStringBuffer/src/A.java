public class A {
    public static String vowelOnly(String input) {
        String vowel = "AEIOUaeiou";
        StringBuffer sbq = new StringBuffer();
        for (char c : input.toCharArray()) {
            if (vowel.contains(String.valueOf(c))) {
                sbq.append(c);
            }
        }
        return sbq.toString();
    }
}



