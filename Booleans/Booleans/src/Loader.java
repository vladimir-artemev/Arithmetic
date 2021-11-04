
public class Loader {
    public static void main(String[] args) {
        int milkAmount = 100; // ml
        int powderAmount = 300; // g
        int eggsCount = 4; // items
        int sugarAmount = 10; // g
        int oilAmount = 30; // ml
        int appleCount = 3;


        if ((powderAmount == 400) && (sugarAmount == 10) && (milkAmount == 1) && (oilAmount == 30)) {
            //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
            System.out.println("Вы сможете приготовить: " + "Pancakes");
        }

        if ((powderAmount == 5) && (milkAmount == 300) && (eggsCount == 5))
        {
            //milk - 300 ml, powder - 5 g, eggs - 5
            System.out.println("Вы сможете приготовить: " + "Omelette");
        }
        if ((powderAmount == 300) && (milkAmount == 100) && (eggsCount == 4) && (appleCount == 3))
        {
            //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
            System.out.println("Вы сможете приготовить: " + "Apple pie");
        }
    }
}