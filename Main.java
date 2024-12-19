// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        int test = 76;
        char grade;

        if (test >= 90) {
            grade = 'A';
        } else if (test >= 80) {
            grade = 'B';
        } else if (test >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Grade = " + grade);
    }
}
