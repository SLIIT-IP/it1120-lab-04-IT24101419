import java.util.Scanner;

public class IT24101419Lab4Q2 {
    public static void main(String[] args) {
        Scanner Scanner =new Scanner(System.in);
        System.out.println("Enter exam marks (out of 100)");
        double examMarks = Scanner.nextDouble();
        if(examMarks<=0 || examMarks>=100){
            System.out.println("Invalid input for exam marks.Terminating program");
            return;
        }
        System.out.println("Enter the lab submission(out of 100)");
        double labSubmission = Scanner.nextDouble();
        if(labSubmission <= 0 || labSubmission >= 100){
            System.out.print("Invalid input for lab submission marks.Terminating program");
            return;
        }
        System.out.println("Please enter the persentage given for th exam");
        double examPersantage = Scanner.nextDouble();
        System.out.println("Please enter the percentage given for the lab submission");
        double labSub = Scanner.nextDouble();
        double marks = examMarks/100 *examPersantage;
        double labMarks = labSubmission/100*labSub;
        double lastMarks = marks + labMarks;
        if (lastMarks<=100){
             System.out.println(lastMarks);
        }else {
            System.out.println("The percentages must add up to 100. Terminating program");
        }
   }
}
