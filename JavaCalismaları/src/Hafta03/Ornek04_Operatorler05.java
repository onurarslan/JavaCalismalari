package Hafta03;

class InstanceOf{
	public void instanceOf(Object params){
		System.out.println(params instanceof InstanceOf);
	}
}

public class Ornek04_Operatorler05 {

	public static void main(String[] args) {
		InstanceOf instance=new InstanceOf();
		
		instance.instanceOf(instance);

	}

}
