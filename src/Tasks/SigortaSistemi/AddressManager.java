package Tasks.SigortaSistemi;

import java.util.Scanner;

public class AddressManager {

    public static void addAddress(User user, Address address){
        user.getAddressList().add(address);
    }

    public static void removeAddress(User user, Address address){
        user.getAddressList().remove(address);
    }

    public static Address createAddress(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter address : ");
        String adr = scn.nextLine();
        return new HomeAddress(adr);


    }
}
