package day33;

public class C02_InsanMain {
    
    
    public static void main(String[] args) {
        C01_AdemOglu insan1=new C01_AdemOglu();
       // insan1.age=47;
        insan1.name="onur";
        insan1.surName="enes";
        insan1.setAge(-45);
        
        System.out.println(insan1.name);
        System.out.println(insan1.surName);
        System.out.println("insan1'in yaşı : "+insan1.getAge());


    } 
        

    
}
