package Pracs.BoksOyunu;

public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run(){
        if (isCheck()){
            int starter = randomStart() ? 1 : 2;
            System.out.println(starter+". dövüşçü maça başladı.");
            while (this.f1.health > 0 && this.f2.health > 0){
                System.out.println("***Yeni Round***");
                if (starter == 1) {
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                } else {
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                }
                System.out.println(this.f1.name+ " Sağlık : "+this.f1.health);
                System.out.println(this.f2.name+ " Sağlık : "+this.f2.health);
            }
        }else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    boolean isCheck(){
      return  (this.f1.weight >= minWeight && this.f1.weight <=maxWeight) &&
              (this.f2.weight >= minWeight && this.f2.weight <=maxWeight);
    }

    boolean isWin(){
        if (this.f1.health == 0){
            System.out.println(this.f2.name+ " kazandı!");
            return  true;
        }

        if (this.f2.health == 0){
            System.out.println(this.f1.name+" kazandı!");
            return true;
        }

        return false;
    }

    boolean randomStart(){
        return Math.random()*2 > 1;
    }
}
