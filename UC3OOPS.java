public class UC3OOPS {

    public static void main(String[] args) {

        // Each line represents one row of the letters O, O, P, S
        // Using String.join(" ", ...) for better memory efficiency

        System.out.println(String.join(" ", "  *****  ", "  *****  ", "  ****** ", "  ****** "));
        System.out.println(String.join(" ", " **   ** ", " **   ** ", " **   ** ", " **      "));
        System.out.println(String.join(" ", " **   ** ", " **   ** ", " **   ** ", " **      "));
        System.out.println(String.join(" ", " **   ** ", " **   ** ", " ******  ", "  *****  "));
        System.out.println(String.join(" ", " **   ** ", " **   ** ", " **      ", "       **"));
        System.out.println(String.join(" ", " **   ** ", " **   ** ", " **      ", " **    **"));
        System.out.println(String.join(" ", "  *****  ", "  *****  ", " **      ", "  ****** "));
    }
}