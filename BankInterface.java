interface Bank{
    int s=1;
    void rateOfIntrest();
}
class SBI implements Bank{
    public void rateOfIntrest(){
        System.out.println("SBI: 8% is the rate of intrest");
    }
}
class UNION implements Bank{
    public void rateOfIntrest(){
        System.out.println("Union: 10% is the rate of intrest");
    }
}
class AXIS implements Bank{
    public void rateOfIntrest(){
        System.out.println("Axis: 12% is the rate of intrest");
    }
}
class BankInterface {
    public static void main(String args[]){
        SBI sbi = new SBI();
        UNION union = new UNION();
        Bank axis = new AXIS();
        sbi.rateOfIntrest();
        union.rateOfIntrest();
        axis.rateOfIntrest();
    }
}