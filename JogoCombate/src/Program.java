
public class Program {

	public static void main(String[] args) {
		
		Champion c1 = new Champion();
		c1.name = "Thor";
		c1.life = 50;
		c1.attack = 8;
		c1.armor = 1;

		Champion c2 = new Champion();
		c2.name = "Meduza";
		c2.life = 40;
		c2.attack = 10;
		c2.armor = 2;
		
		c1.takeDamage(c2);
		c2.takeDamage(c1);
		
		System.out.println("Thor após tomar ataque da Meduza: "+ c1.life);
		System.out.println("Meduza após tomar ataque do Thor: "+ c2.life);
		
	}

}
