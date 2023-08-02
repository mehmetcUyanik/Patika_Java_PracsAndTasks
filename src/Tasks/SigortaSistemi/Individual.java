package Tasks.SigortaSistemi;

import java.util.ArrayList;

class Individual extends Account{

    public Individual(){
        this.setStatus(AuthenticationStatus.FAIL);
        this.setInsuranceList(new ArrayList<>());
        setType(0);
    }

    public Individual(User user){
        this();
        this.setUser(user);
    }

    @Override
    public void addAddress(Address address) {
        user.getAddressList().add(address);
    }

    @Override
    public void removeAddress(Address address) {
        user.getAddressList().remove(address);
    }

    @Override
    public void addInsurance(Insurance i) {
        User.getInsuranceList().add(i);
    }
}
