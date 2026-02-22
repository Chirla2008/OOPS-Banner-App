public class UC3OOPS {

    public static void main(String[] args) {
        printBanner();
    }

    // Static method to create banner
    public static void printBanner() {

        String line1 = "************************";
        String line2 = "*      OOPS APP       *";
        String line3 = "*   String Join UC3   *";
        String line4 = "************************";

        String banner = String.join("\n",
                line1,
                line2,
                line3,
                line4
        );

        System.out.println(banner);
    }
}