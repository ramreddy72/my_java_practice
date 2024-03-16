package Capgemini;

public class UnicodeDecode {
    public static void main(String[] args) {
        String str = "Per procedere con la transazione è necessario eseguire : l'autenticazione. E' necessario ";
        System.out.println("Original String: " + str);
        System.out.println("Unicode String: " + unicodeString(str));
    }

    public static String unicodeString(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == '`' || c == '\'' || c == 'è')
            {
                sb.append("\\u").append(Integer.toHexString(c | 0x10000).substring(1));
            } else {
                sb.append(c); 
            }
        }
        return sb.toString();
    }
}
