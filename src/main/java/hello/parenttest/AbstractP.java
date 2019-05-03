package hello.parenttest;

public abstract class AbstractP<T>{

	public void init(T t) {
		System.out.println("This is init method.");
		cTest(t);
	}
	
	//public void a();
	//public void b();
	public abstract void cTest(T t);
}
