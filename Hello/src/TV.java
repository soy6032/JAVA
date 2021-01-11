interface Device {
   void on();
   void off();
}
public class TV implements Device {
   public static void main(String[] args) {
      TV myTV = new TV();
      myTV.on();
      myTV.watch();
      myTV.off();
   }
   public void on() {
      System.out.println("TV가 켜졌습니다.");
   }
   public void off() {
      System.out.println("TV가 꺼졌습니다.");
   }
   public void watch() {
      System.out.println("TV 방송을 시청중입니다.");
   }
}