package Tasks.MaceraOyunu;

import java.util.Random;

public class BattleLoc extends Location{

    private Creature creature;
    private String award;
    private int maxCreature;

    public BattleLoc(Player player, String name, Creature creature, String award, int maxCreature) {
        super(player, name);
        this.creature = creature;
        this.award = award;
        this.maxCreature = maxCreature;
    }

    @Override
    public boolean onLocation() {
        int creNum = this.randomCreNum();
        System.out.println("Buradasınız -> " + this.getName());
        System.out.println("Dikkat savaşa hazır ol " + creNum  + " " + this.getCreature().getName() + " yakınlarında.");
        System.out.print("<S>avaş ya da <K>aç: ");
        String selectCase = scan.nextLine().toUpperCase();

        if (selectCase.equals("S") && combat(maxCreature)) {
            System.out.println("Savaş başladı!");
            return true;
        }

        if (this.getPlayer().getHealth() <= 0) {
            System.out.println("Öldün...");
            return false;
        }
        return true;
    }

    public boolean combat(int mexCreature) {
        for (int i = 1; i < mexCreature; i++) {
            this.getCreature().setHealth(this.getCreature().getOrgHealth());
            playerStats();
            monsterStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getCreature().getHealth() > 0) {
                System.out.println("<S>avaş ya da <K>aç: ");
                String selectCombat = scan.nextLine().toUpperCase();
                if (selectCombat.equals("S")) {
                    System.out.println("Senin saldırın: ");
                    this.getCreature().setHealth((this.creature.getHealth() - this.getPlayer().getTotalDamage()));
                    afterHit();
                    if (this.getCreature().getHealth() > 0) {
                        System.out.println("Canavar saldırısı: ");
                        int creatureDamage = this.getCreature().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (creatureDamage < 0) {
                            creatureDamage = 0;
                        }
                        this.getPlayer().setHealth((this.getPlayer().getHealth() - creatureDamage));
                        afterHit();
                    }
                } else {
                    return false;
                }
            }
            if (this.getCreature().getHealth() < this.getPlayer().getHealth()) {
                System.out.println("Kazandın!");
                System.out.println(this.getCreature().getAward() + " para kazandın!");
                this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getCreature().getAward());
                System.out.println("Tolam paran: " + this.getPlayer().getMoney());
            } else {
                return false;
            }
        }
        return true;
    }

    public void afterHit() {
        System.out.println("Canın: " + this.getPlayer().getHealth());
        System.out.println(this.getCreature().getName() + " Canı: " + this.getCreature().getHealth());
        System.out.println("-----------------");
    }

    public void playerStats() {
        System.out.println("Oyuncu Bilgileri");
        System.out.println("----------------");
        System.out.println("Sağlık : " + this.getPlayer().getHealth());
        System.out.println("Zırh : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Silah : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Hasar : " + this.getPlayer().getTotalDamage());
        System.out.println("Blok : " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Para : " + this.getPlayer().getMoney());
        System.out.println("");


    }

    public void monsterStats(int i) {
        System.out.println(i + "." + this.getCreature().getName() + " Özellikleri :");
        System.out.println("----------------");
        System.out.println("Sağlık : " + this.getCreature().getHealth());
        System.out.println("Hasar : " + this.getCreature().getDamage());
        System.out.println("Ödül : " + this.getCreature().getAward());

    }

    public int randomCreNum() {
        Random r = new Random();
        return r.nextInt(this.getMaxCreature()) ;
    }

    public Creature getCreature() {
        return creature;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxCreature() {
        return maxCreature;
    }

    public void setMaxCreature(int maxCreature) {
        this.maxCreature = maxCreature;
    }
}
