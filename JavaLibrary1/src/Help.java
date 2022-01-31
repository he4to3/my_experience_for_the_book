public class Help {
public static void main(String args[]) 
    throws java.io.IOException {
        
        int choice;
        
         System.out.println("Справка:\n 1. If\n 2. switch\n Выберите:");
        choice = (int) System.in.read();
    System.out.println("\n");
    switch(choice) {
        case '1':
        System.out.println("Инструкция if:\n ");
                System.out.println("if (условие) инструкция;");
                System.out.println("else инструкция;");
                break;
        case '2':
                System.out.println("Инструкция switch: \n");
                System.out.println("switch (выражение) {");
                System.out.println("case константа:");
                System.out.println("последовательность инструкций");
                System.out.println("break;");
                System.out.println("// ...");
                System.out.println("}");
                break;
        default:
            System.out.println("Запрос не найден.");
    }
    }
}