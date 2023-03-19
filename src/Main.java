public class Main {
    public static void main(String[] args) {

    String palindrom = "saippuakivikauppias";
    boolean result = true;
        for (int i = 0; i < palindrom.length(); i++) {
            if (palindrom.charAt(i) != palindrom.charAt(palindrom.length()- 1 - i)) {
                result = false;
            }
        }
        if (result) {
            System.out.println("палиндром");
        } else {
            System.out.println("не палиндром");
        }
    }
}