package Assignment;

public class LoopsAssignment {

        public static void main(String[] args) {
            LoopsAssignment Loops = new LoopsAssignment();
            Loops.countNumbers();
        }
        public void countNumbers() {
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 2 == 0)
                    System.out.println("The number " + i + " is divisible by two and three");
                else if(i % 3 == 0)
                    System.out.println("The number " + i + " is divisible by three");
                else if (i % 2 == 0)
                    System.out.println("The number " + i + " is even ");
                else
                    System.out.println("The number " + i + " is odd ");
            }
        }
    }


