package TechnicalTheoryQuestions;

public class T4_InterfaceAbstractionExample2 extends BaseAbstract implements BaseInterface{

	public static void main(String args[])
	{
		//colour();
		T4_InterfaceAbstractionExample2 nc=new T4_InterfaceAbstractionExample2();
				nc.colour();
				nc.eat();
				nc.animalVariety();
				nc.eatAnimal();
	}

	@Override
	void colour() {
		// TODO Auto-generated method stub
		System.out.println("colour is cat");
	}

	@Override
	public void animalVariety() {
		// TODO Auto-generated method stub
		System.out.println("Cat varietry");
	}

	@Override
	public void eatAnimal() {
		// TODO Auto-generated method stub
		System.out.println("eating rat");
	}
}
