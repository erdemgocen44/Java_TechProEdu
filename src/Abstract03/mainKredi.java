package Abstract03;

public class mainKredi {
    public static void main(String[] args) {
        EmlakKredisi emlk=new EmlakKredisi(20000);
        emlk.bilgiVer();

        IhtiyacKredisi ik=new IhtiyacKredisi(10000);
        ik.bilgiVer();
    }
}
