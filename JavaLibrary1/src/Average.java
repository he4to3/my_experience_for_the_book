public class Average {
public static void main(String args[]){
    double[] average ={20.5,10,15.5,14,20,53.6,12};
  double sum = 0;
    for(double ave: average){
                sum += ave;
    }
    sum = sum / average.length;
    System.out.print("average massiv = " +sum);
}
}