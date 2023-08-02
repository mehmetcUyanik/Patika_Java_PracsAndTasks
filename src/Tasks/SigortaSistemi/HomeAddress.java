package Tasks.SigortaSistemi;

class HomeAddress implements Address {
    private String address;

    public HomeAddress(String address){
        this.address = address;
    }

    @Override
    public void setAddress(String address){
        this.address = address;
    }

    @Override
    public String getAddress() {
        return address;
    }


}

