class A{
public A(){
B b = new B();
}
}

class B{
public B(){
C c = new C();
}
}

class C{
public C(){
A a = new A();
}
}

public class CDTest{
public static void main(String args[]){
  A a = new A();  
}
}
//stackOverflowError will comes because each time its cyclic dependency of calling object