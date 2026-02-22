public class UC4OOPS {

    public static void main(String[] args) {

        // Step 1: Create a String array to store banner lines
        String[] banner = {
                "*************",
                "*  WELCOME  *",
                "*   UC4 APP  *",
                "*************"
        };

        // Step 2: Use enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}