package inner;
class Demo{
	public void show(){
		System.out.println("hi");
	}
}
public class Anonymous_Class {
static Demo d = new Demo() {
    public void show() {
        super.show();
        System.out.println("HELLO");
    }
};
	public static void main(String[] args) {
	d.show();
	}

}
