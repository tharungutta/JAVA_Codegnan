package Static_and_NonStatic;

public class Car {
     int carid;
     float carmodel;
     float price;
     
     Car(){
    	 this(10, 100.01f, 300000);
//    	 carid = 100;
//    	 carmodel = 1001.01f;
//    	 price = 4000000;
     }
    private  Car(int carid, float carmodel, float price){
    	 this.carid = carid;
    	 this.carmodel = carmodel;
    	 this.price = price;
     }
    private void display() {
    	 System.out.println(carid);
    	 System.out.println(carmodel);
    	 System.out.println(price);
     }
    void show() {
    	this.display();
    }
}
