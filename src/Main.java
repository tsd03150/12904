import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        String t = kb.next();

        while (s.length() <= t.length()) {
            if (s.equals(t)) {
                System.out.println(1);
                return;
            } else {
                if (t.charAt(t.length() - 1) == 'A') {
                    t = t.substring(0, t.length() - 1);
                } else {
                    t = t.substring(0, t.length() - 1);
                    StringBuilder str = new StringBuilder(t);
                    t = String.valueOf(str.reverse());
                }
            }
        }

        System.out.println(0);

    }

}
