package day36;

public class Derived {
    public Derived (){
        System.out.println("Derived class ");

    }
    public static class Test01 extends Derived{
        public Test01(){
            System.out.println("Test class" );

        }
        public static void main(String[] args) {
            Test01 obj=new Test01();
        }
    }

}
