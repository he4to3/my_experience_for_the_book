public class QDemo {
    public static void main(String args[]){
    Queue bigQ = new Queue(100);
    Queue smallQ = new Queue(4);
    int ch;
    int i;
    
    System.out.println("Использование очереди bigQ для сохранения алфавита");
    for (i=0; i <100;i++){
        bigQ.put(i++);
    }
    System.out.print("Содержание очереди bigQ: ");
    for(i=0;i <100; i++){
        ch = bigQ.get();
        if(ch != 0){
            System.out.print(ch);
        }
    }
    System.out.println("\n");
    System.out.println("Использование очереди smallQ для генерации ошибок");
    for (i=0; i<5;i++){
        System.out.print("Попытка сохранения " +  (100 - i));
        smallQ.put((100 - i));
        System.out.println();
    }
    System.out.println();
    
    for (i=0; i <5; i++){
        ch=smallQ.get();
        if(ch != 0){
            System.out.print(ch);
        }
    }
    }
}
    class Queue {
         int[] q;
        int putloc, getloc;
        
        
    Queue(int size){
        q= new int[size];
        putloc= getloc=0;
        
    }
    void put (int ch) {
        if(putloc==q.length) {
            System.out.println(" - Очередь заполнена");
            return;
        }
        q[putloc++] = ch;
    }
    int get() {
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return 0;
        }
        return q[getloc++];
    }
    }
    
