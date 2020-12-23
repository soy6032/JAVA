package ch07_1;

public class Car2Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Car2 car2 = new Car2();
      
      for (int i = 1; i <= 5; i++) {
         int problemLocation = car2.run();
         
         if (problemLocation != 0) {
            System.out.println(car2.tires[problemLocation - 1].location + " HankookTire·Î ±³Ã¼");
            car2.tires[problemLocation - 1] = new HankookTire(car2.tires[problemLocation].location, 15);
         }
         
         System.out.println("-------------------------");
      }
   }

}