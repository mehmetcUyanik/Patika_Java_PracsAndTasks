package Tasks.MaceraOyunu;

import java.util.Scanner;

public class Game {

    Scanner scan = new Scanner(System.in);

    public void start() {
        System.out.println("Macera oyunu başlıyor");
        System.out.print("Lütfen oyuncu adı giriniz: ");
        String playerName = scan.nextLine();
        Player player = new Player(playerName);
        System.out.println("Hoşgeldin " + player.getName() + ".Lütfen karakterini seç.");
        System.out.println("------------------------------------------------------------------------------------");
        player.selectChar();


        Location location = null;
        while (true) {
            player.printInfo();
            System.out.println();
            System.out.println("#####Konum#####");
            System.out.println();
            System.out.println("1 - Güvenli Ev");
            System.out.println("2 - Mağaza");
            System.out.println("3 - Mağara");
            System.out.println("4 - Orman");
            System.out.println("5 - Nehir");
            System.out.println("6 - Maden");
            System.out.println("0 - Çıkış");
            System.out.println("Lütfen nereye gitmek istediğini seç.");
            int selectLoc = scan.nextInt();
            switch (selectLoc) {
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;
                case 6:
                    location = new Mine(player);
                    break;
                default:
                    location = new SafeHouse(player);
            }
            if (location == null){
                System.out.println("Pes ettiniz...");
                break;
            }
            if(!location.onLocation()){
                System.out.println("Oyun Bitti...");
                break;
            }
        }
    }

}
