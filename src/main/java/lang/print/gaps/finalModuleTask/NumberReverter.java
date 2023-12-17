package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        String result = reverseString(number + "");
        System.out.println(result);
    }
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
