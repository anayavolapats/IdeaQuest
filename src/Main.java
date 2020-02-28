import java.util.Scanner;

public class Main {
    public static Character student;
    public static Story story;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        story = new Story();
        while (true) {
            System.out.println(story.current_situation.text);
            if (story.isEnd()) {
                System.out
                        .println("====================  Finita la commedia!   ===================");
                return;
            }
            story.go(in.nextInt());
        }

    }

}
