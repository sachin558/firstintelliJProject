public class Basicjava {
    public static void main(String[] args) {
        int c=0;
        String n="vnghrekjfnjjskkaAjkl";
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == 'A'||n.charAt(i)=='a') {
                System.out.println(n.charAt(i));
               c++;
            }

        }
        System.out.println(c);
    }

}


