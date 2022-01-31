public class Tarelki {
public static void main(String args[]){
    Stack stk1 = new Stack(10);
    
    char name[] = {'T', 'o', 'm'};
    
    Stack stk2= new Stack(name);
    char ch;
    int i;
    
    for(i=0; i<10;i++){
        stk1.push((char)('A'+i));
    }
    Stack stk3=new Stack(stk1);
    System.out.print("Содержимое stk1:");
    for(i=0;i<10;i++){
        ch = stk1.pop();
        System.out.print(ch);
    }
    System.out.println("\n");
     System.out.print("Содержимое stk2:");
    for(i=0;i<3;i++){
        ch = stk2.pop();
        System.out.print(ch);
}
     System.out.println("\n");
       System.out.print("Содержимое stk3:");
    for(i=0;i<10;i++){
        ch = stk3.pop();
        System.out.print(ch);
}
}
}
class Stack {
private char stck[];
private int tos;

Stack (int size){
    stck = new char[size];
    tos=0;
}
Stack (Stack ob) {
    tos=ob.tos;
    stck=new char[ob.stck.length];
    
    for(int i = 0; i<tos;i++)
        stck[i]=ob.stck[i];
}
Stack(char a[]) {
    stck = new char[a.length+1];
    for (int i=0; i<a.length;i++)
        push(a[i]);
    
}
void push (char ch){
    if(tos ==stck.length){
        System.out.println("-- Стек заполнен");
        return;
    }
    stck[tos++] = ch;
    tos++;
}
char pop(){
    if(tos == 0) {
        System.out.println(" -- Стек пуст");
        return 0;
    }
    tos--;
    return stck[tos];
}
}