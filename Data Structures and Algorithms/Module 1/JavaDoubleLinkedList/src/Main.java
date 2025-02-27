import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        //Declaring and initializing a LinkedList
        LinkedList<String> recipeSteps = new LinkedList<>();
        recipeSteps.add("Preheat the oven to 350°F.");
        recipeSteps.add("Mix flour and sugar.");
        recipeSteps.add("Add eggs and milk.");
        System.out.println("Recipe Steps: " + recipeSteps);

        //Adding element to the front or end
        // Adding a step at the beginning
        recipeSteps.addFirst("Gather all ingredients.");
        // Adding a step at the end
        recipeSteps.addLast("Serve and enjoy.");
        System.out.println("Updated Recipe Steps: " + recipeSteps);

        //Adding element in the middle
        // Adding a step at a specific position (index 2)
        recipeSteps.add(2, "Whisk the eggs before adding.");
        System.out.println("Recipe Steps after adding in the middle: " + recipeSteps);

        //Removing an element
        // Removing the first step
        recipeSteps.removeFirst();
        System.out.println("Recipe Steps after removing first element: " + recipeSteps);
        // Removing the last step
        recipeSteps.removeLast();
        System.out.println("Recipe Steps after removing the last step: " + recipeSteps);
        // Removing a step at a specific position (index 1)
        recipeSteps.remove(1);
        System.out.println("Recipe Steps after removing a step from the middle: " + recipeSteps);

        //Traversal : Using ListIterator to traverse the list
        ListIterator<String> iterator = recipeSteps.listIterator();
        // Forward traversal
        System.out.println("Traversing forward through the recipe:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Backward traversal
        System.out.println("\nTraversing backward through the recipe:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
        //traversal with ListIterator is flexible,
        // allowing you to stop at any point based on specific criteria
        while (iterator.hasNext()) {
            String step = iterator.next();
            if (step.equals("Mix flour and sugar.")) {
            break; // Stop traversal when a specific step is found
            }
        }
    }
}
