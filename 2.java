class Example2 {
	void Twin(int x, float y){}
}
class SubExample2 extends Example2{
	public void Twin(int x, float y){}
}
class utama{
	public static void main(String args[])
{
	Example2 a = new Example2();
	SubExample2 e = new SubExample2();
	int b = 1;
	float c = 2;
	a.Twin(b,c);
	e.Twin(b,c);
}
}
