import java.util.Arrays;

public class SalaryHistogram {

    public static int[] histogram(int[] salaries, int rangeSize) {
        int maxSalary = 0;
        for (int salary : salaries) {
            if (salary > maxSalary) {
                maxSalary = salary;
            }
        }
        int numRanges = (maxSalary + 1) / rangeSize;
        int[] histogram = new int[numRanges];
        for (int salary : salaries) {
            int rangeIndex = salary / rangeSize;
            histogram[rangeIndex]++;
        }
        return histogram;
    }

    public static void main(String[] args) {
        int[] salaries = { 30000, 75000, 20000, 90000, 50000, 10000, 70000 };
        int rangeSize = 10000;
        int[] histogram = histogram(salaries, rangeSize);
        System.out.println(Arrays.toString(histogram));
    }
}
