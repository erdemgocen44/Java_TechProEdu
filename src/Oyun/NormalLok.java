package _JavaStudy._99_JavaProjects.Oyun;

public abstract class NormalLok extends Lokasyon{
    NormalLok(Player player, String name){
        super(player);
        this.name=name;
    }

    public boolean getLocation(){
        return true;
    }

}
