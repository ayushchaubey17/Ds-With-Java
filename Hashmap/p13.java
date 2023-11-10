public class p13 {
    public static void main(String[] args) {
        String p ="this.is.me.who.looks.like.so.smart";

        String k []  = p.split("\\.");

        for (int i = 0; i < k.length; i++) {
            String b = k[i];
            char r = b.charAt(0);
            char ca = (char) (r-32);
          k[i]=  b.replace(r, ca);
        }




      String m =   String.join(" ", k);
        System.out.println(m);
    }
}
