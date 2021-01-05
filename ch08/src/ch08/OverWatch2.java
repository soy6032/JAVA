package ch08;

public class OverWatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zarya z = new Zarya();
		Winston w = new Winston();
		DVa d = new DVa();
		
		z.forward();
		z.attack();
		z.skill();
		z.spacialSkill();
		
		w.left();
		w.right();
		w.skill();
		w.attack();
		
		d.attack();
		d.backward();
		d.skill();
		d.spacialSkill();
		
		System.out.println("\n-----추상 클래스로 구현-----");
		
		DVaClass dc = new DVaClass();
		dc.attack();
		dc.skill();
		
		System.out.println("\n-----인터페이스 다중 상속시 다형성-----");
		
		Movement vm = null;
		Attack va = null;
		
		vm = z;
		vm.left();
		vm.right();
		vm.forward();
		vm.backward();
		
		va = z;
		va.attack();
		va.skill();
		va.spacialSkill();
		
		
		Character2 ch2 = new Sombra();
		
		ch2.attack();
		ch2.left();

	}

}
