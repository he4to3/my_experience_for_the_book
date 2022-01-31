public class CtrokaNaoborot {
public static void main(String args[]){
    Factorial fac= new Factorial("Test");
    fac.backward(0);
}
}
class Factorial {
    String str;
    
    Factorial(String q) {
       str = q;
       }
    void backward (int idx) {
        if(idx != str.length()-1) {
            backward (idx+1);
            System.out.println(str.charAt(idx));
        }
        
    }
}