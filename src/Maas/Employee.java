package _JavaStudy._99_JavaProjects.Maas;

public class Employee {
    String isim;
    double maas;
    int calistigiSaat;
    int iseBasladigiYil;


    public static double vergi(Employee employee){
        if (employee.maas>1000){
            return employee.maas*0.03;
        }
        else {
            return 0.0;
        }
    }
    public static double bonus(Employee employee){
        int ekstraSaat=employee.calistigiSaat-40;
        if (ekstraSaat>0){
            return ekstraSaat*30;
        }
        else
            return 0.0;
    }

    public static double maasArtisi(Employee employee){
        int yil= 2021-employee.iseBasladigiYil;
        if (yil<10){
            return employee.maas*0.05;
        }
        else if (yil>=10 && yil<20){
            return employee.maas*0.10;
        }
        else
            return employee.maas*0.15;
    }

    public static void bilgiYaz(Employee employee){
        System.out.println("Vergi="+vergi(employee));
        System.out.println("Bonus="+bonus(employee));
        System.out.println("Maaş artışı="+maasArtisi(employee));
        double toplamMaas=employee.maas-vergi(employee)+bonus(employee);
        System.out.println("Toplam maaş="+toplamMaas);
        System.out.println("Maaş zam ile birlikte="+(maasArtisi(employee)+toplamMaas));
    }
    public static  Employee calisanBilgi(String isim,double maas,int calistigiSaat,int iseBasladigiYil){
        Employee yenicalisan=new Employee();
        yenicalisan.isim=isim;
        yenicalisan.maas=maas;
        yenicalisan.calistigiSaat=calistigiSaat;
        yenicalisan.iseBasladigiYil=iseBasladigiYil;

        return yenicalisan;
    }


}
