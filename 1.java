interface Animal{ //semua method belum didefinisikan
	public void sleeps();
}
class Dog implements Animal{
	public void sleeps(){};
}
class SomeClass{
	public static void main (String[] args)
	{
		Dog d = new Dog();
		if(d instanceof Animal)
			System.out.println("true");
		else
			System.out.println("false");
	}
}
