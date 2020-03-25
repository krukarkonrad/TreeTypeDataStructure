import java.util.Scanner;

public class Menu {

    public static void showMenu(Tree tree){
        System.out.println(tree.toString());
        int index, choice = 0;
        Scanner in = new Scanner(System.in);

        do{
            System.out.println("What do you want to do?");
            System.out.println("1 - Sum of subtree");
            System.out.println("2 - AVG from subtree");
            System.out.println("3 - Median from subtree");
            System.out.println("0 - Leave");

            choice = Integer.parseInt(in.nextLine());

            if(choice != 0){
                System.out.print("Give an index of subtree: ");
                index = Integer.parseInt(in.nextLine());
                evokeFunction(choice, index, tree);
            }

        }while (choice != 0);
    }

        private static void evokeFunction(int choice, int index, Tree tree){
            switch (choice){
                case 1:
                    System.out.println(tree.sumSubtreeByIndex(index));
                    break;
                case 2:
                    System.out.println(tree.averageValueByIndex(index));
                    break;
                case 3:
                    System.out.println(tree.medianValueByIndex(index));
                    break;
                default:
                    System.out.println("No such operation");
                    break;
            }
        }

}
