public class Help2 {
public static void main(String args[]) 
    throws java.io.IOException {
        
        char choice, ignore;
        do {
         System.out.println("Справка:\n 1. If\n 2. switch\n 3. for\n 4. while\n 5. do-while\n \n Выберите:");
        choice = (char) System.in.read();
        do {
            ignore = (char) System.in.read();
        } while (ignore != '\n');
        } while (choice <'1' | choice > '5');
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
        case '3':
            System.out.println("Цикл for:\n");
            System.out.println("for (инициализация; условие; итерация;)");
            System.out.println(" инструкция;");
            break;
        case '4':
            System.out.println("Цикл while:\n");
            System.out.println("while(условие) инструкция;");
            break;
        case '5':
            System.out.println("Цикл do-while:\n");
            System.out.println("do {");
            System.out.println("инструкция");
            System.out.println("} while (условие);");
            break;
       
    }
    }
}