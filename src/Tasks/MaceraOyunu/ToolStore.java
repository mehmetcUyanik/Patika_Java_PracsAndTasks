package Tasks.MaceraOyunu;

public class ToolStore extends NormalLoc{

    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("Mağazaya hoşgeldin...");
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("Neye ihtiyacın var?");
            System.out.println("1 - Silah");
            System.out.println("2 - Zırh");
            System.out.println("3 - Çıkış");
            System.out.println("Lütfen seçim yap: ");
            int selectCase = Location.scan.nextInt();
            while (selectCase < 1 || selectCase > 3) {
                System.out.println("Hatalı bir giriş yaptın... Tekrar dene: ");
                selectCase = scan.nextInt();
            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Görüşmek üzere...");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("---- Silahlar ----");
        for (Weapon w : Weapon.weapons()) {
            System.out.println(w.getId() + "-" + w.getName() + " "
                    + " <Para : " + w.getPrice() + ", Hasar : " + w.getDamage() + ">");
        }
        System.out.println("0 - Çıkış");
    }

    public void buyWeapon() {

        System.out.println("Hangi silahı seçmek istersin : ");
        int selectWeaponID = scan.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.println("Hatalı bir giriş yaptın... Tekrar dene: ");
            selectWeaponID = scan.nextInt();
        }
        if(selectWeaponID != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjectByID(selectWeaponID);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paran yok...");
                } else {
                    System.out.println(selectedWeapon.getName() + " satın aldın.");
                    int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan paran : " + this.getPlayer().getMoney());
                    System.out.println("Son silahın : " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                    System.out.println("Yeni silahın : " + this.getPlayer().getInventory().getWeapon().getName());

                }
            }

        }
    }

    public void printArmor() {

        System.out.println("---- Zırhlar ----");
        for (Armor a : Armor.armors()) {
            System.out.println(a.getId() + " - " + a.getName() +
                    " <Blok : " + a.getBlock() + " , Para : " + a.getPrice() + ">");
        }
        System.out.println("0 - Çıkış");

    }

    public void buyArmor() {
        System.out.println("Hangi zırhı seçmek istersin : ");
        int selectArmorID = scan.nextInt();
        while (selectArmorID < 0 || selectArmorID > Armor.armors().length) {
            System.out.println("Hatalı bir giriş yaptın... Tekrar dene: ");
            selectArmorID = scan.nextInt();

        }
        if (selectArmorID != 0){
            Armor selectedArmor = Armor.getArmorObjectByID(selectArmorID);
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paran yok...");
                } else {
                    System.out.println(selectedArmor.getName() + " satın aldın.");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() - selectedArmor.getPrice());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Kalan paran : " + this.getPlayer().getMoney());
                }
            }
        }

    }
}
