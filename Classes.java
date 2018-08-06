public class Classes{
	public static void main(String[] args) {
        Test test = new Test();
        test.setA(3);
        System.out.println(test.getA());
    }
}

class Test {
	private int a;
	public int getA(){
		return a;
	}

	public void setA(int a){
		this.a = a;
	}
}
