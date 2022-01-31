public class TruckDemo {
    public static void main(String args[]){
Truck semi = new Truck(2,200,7, 44000);
Truck pickup = new Truck(3,28,15,2000);
double gallons;
int dist = 252;

gallons = semi.fuelneeded(dist);

System.out.println("Грузовик может перевезти " + semi.getCargo() + " фунтов.");
System.out.println("Для преодоления " + dist + " миль грузовику требуется " + gallons + " галлонов топлива. \n");

gallons = pickup.fuelneeded(dist);

System.out.println("Пикап может перевезти " + semi.getCargo() + " фунтов.");
System.out.println("Для преодоления " + dist + " миль пикапу требуется " + gallons + " галлонов топлива. \n");
}
}
class Vehicle {
    private int passangers, fuelcap, mpg; // колво пассажиров, обьем топл бака(галоны), потребление топлива(миль/галон)
    
    Vehicle (int p, int f, int m) {
        passangers = p;
        fuelcap=f;
        mpg=m;
    }
   int range(){ // дальность транспортного средства
       return mpg*fuelcap;
   } 
   double fuelneeded(int miles) { // сколько топлива нужно для заданных миль
       return miles / mpg;
   }
   // Dostup
   int getPassangers() {
       return passangers;
   }
   void setPassengers(int p) {
       passangers=p;
   }
   int getFuelcap() {
       return fuelcap;
   }
   void setFuelcap(int f){
       fuelcap=f;
   }
   int getMpg(){
       return mpg;
   }
   void setMpg(int m){
       mpg=m;
   }
}
class Truck extends Vehicle {
    private int cargocap; // грузоподьемность в фунтах
    // Конструктор трака
    Truck (int p, int f, int m, int c){
        // обращается к конструктору вехакла
        super (p,f,m);
        
        cargocap=c;
    }
    int getCargo() {
        return cargocap;
    }
    void putCargo(int c) {
        cargocap = c;
    }
}