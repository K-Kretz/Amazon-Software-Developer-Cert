import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> clues = new LinkedList<String>();
        clues.add("Check inside the mailbox");
        clues.add("Go to the Fountain in the park");
        clues.add("Look for the Oak Tree");

        System.out.println(clues);
        clues.set(2, "Look behind the old Oak tree");
        System.out.println("updated clues :  " +clues);

        String firstClue = clues.get(0);
        System.out.println("First clue: " + firstClue);

        String secondClue = clues.get(1);
        System.out.println("2nd clue: " + secondClue);

        clues.removeLast();
        System.out.println(clues);

        clues.remove(1);
        System.out.println(clues);
    }
}
