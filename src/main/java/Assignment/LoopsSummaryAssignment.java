package Assignment;

public class LoopsSummaryAssignment {
    public static void main(String[] args) {
        LoopsSummaryAssignment Loops = new LoopsSummaryAssignment();
//        Loops.summaryNumbers(1);
        Loops.summaryNumbers();
    }

    int a = 3;
    int b = 5;

    int sum = 0;

    public void summaryNumbers() {
        for (int i = a; i <= b; i++) {
            sum += i;

        }
        System.out.println(sum);
    }
}
