package Tasks.MaceraOyunu;

public class SafeHouse extends NormalLoc{

    public SafeHouse(Player player) {
        super(player,"Güvenli Ev" );
    }
    @Override
    public boolean onLocation(){
        System.out.println("Güvenli evdesin.");
        System.out.println("Canın yenilendi.");
        this.getPlayer().setHealth(this.getPlayer().getOrgHealth());
        return true;
    }
}
