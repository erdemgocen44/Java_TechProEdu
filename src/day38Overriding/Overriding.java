package day38Overriding;

public class Overriding {
  //Overriding: Parent class daki bir metodu
  //özelleştirerek child class da kullanmadır.
  //KURALLARI
  //1- Parent class daki metodda Signature yani metodun
  //ismi ve parametresi asla değişmez.
  //2- Overriding create edilirken "access modifier" belli
  //kriterlere göre değiştirilebilir.
  //3- Overriding create edilirken "return type" belli
  //kriterlere göre değiştirilebilir.
  //4- Asla static olamaz çünkü gökteki
  //ayı indirip ezemezsin.
  //5- Overriding create edilirken "method body" %99 değişir
  //değiştirilmezse CTE vermez. fazladan iş olur.
  //Overriding in amacı bodyi create etmektir.
  //6- Overriding create edilirken "parent-child "ilişkisi
  //şarttır. Inheritance olmadan overriding olmaz.
  //7- Overridden method : Parent classdaki ezilen methoddur.
  //   Overridding method :Child classdaki ezen methoddur.
  //8- Overridden method child'ın AccessModifier ı ya
  //"Overridden method"(parent) ile aynı yada daha geniş
  //olmalı.Evlat babanın erişimini daraltamaz ama genişletebilir.
  //SubAccMod >= SuperAccMod
  //Parent ve child ın return typeları aynı olmalıdır.
  //9- Overriding method childin return type wrapper classdan ise Overridden
  //10- Javanın create ettiği bir class return type olduğu gibi
  //kullanıcının girdiği classlarda return type olabilir.
  //11- Overriding method childin return type ile 
  //"Overridden method" (parent) arasında Is-A 
  //(child-parent relationship) ilişkisi olmalı
  //12- Static methodlar Overriding edilemezler. 
  //13- Private methodlar overriding edilemezler.
  //final methodlar overrriding edilemezler.
  //final :son hali, değiştirilemez
  //14- Polymorphism; overloading ve overriding den 
  //oluşan yapıya denir.
  //"overloading"-->>public void yemek(){...}
  //                 public void yemek(String isim){}
  //                 public void yemek(String isim, int fiyat){}
  //
  //
  //"overriding"-->>public void icmek(){syso gazoz}
  //                public void icmek(){syso kahve}
  //                public void icmek(){syso 3+2} 

  //overloading ile overriding arasındaki farklar
  //A)overloading de method signature değiştirilir.(name+parametre)
  //  overriding de method signature asla değişmez(name+parametre)

  //B)overloading de inharitance gerekmez
  //  overriding de inharitance olmadan olmaz.

  //)C)overloading de body genellikle değiştirilmez
  //   overriding de hememn hemen her zaman değiştirilir.

  //)D)Static methodlar overriding edilemezler ama overloading ler edilebilirler
  //   Private methodlar overriding edilemezlerç ama overloading edilemezler.

  //overloading CompileTime Polymorphism dir yani statictir.
  //overriding run time polymorphismdir yani dinamik yapılı.
  



}
