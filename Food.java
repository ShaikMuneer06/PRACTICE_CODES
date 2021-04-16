package em;
enum Menu{
	PIZZA,BURGER,COKE,DOSA;
	public void favFood(){
		System.out.println("FAVOURITE FOOD");
	}
}
public class Food {

	public static void main(String[] args) {
		Menu m1 = Menu.BURGER;
		System.out.println(m1);
		Menu m2 = Menu.COKE;
		System.out.println(m2);
		m1.favFood();
	}

}
