package TechnicalTheoryQuestions;

public class T3_InterfaceAbstractionExample1 extends BaseAbstract  implements BaseInterface,T2_InterfaceAfterJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//colour();
		T3_InterfaceAbstractionExample1 nc=new T3_InterfaceAbstractionExample1();
		nc.colour();
		nc.eat();
		nc.animalVariety();
		nc.eatAnimal();
	}

	void colour() {
		// TODO Auto-generated method stub
		System.out.println("Colour is Dog");
	}

	@Override
	public void animalVariety() {
		// TODO Auto-generated method stub
		System.out.println("Dog varietry");
		
	}

	@Override
	public void eatAnimal() {
		// TODO Auto-generated method stub
		System.out.println("dog is eating cat");
	}
	

}
