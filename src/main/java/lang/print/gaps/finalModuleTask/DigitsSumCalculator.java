package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        System.out.println(Math.round(number / 1000)+Math.round((number%1000)/100) + Math.round((number%100)/10) + Math.round(number%10));
    }
}
