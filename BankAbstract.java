abstract class Bank{
    abstract void rateOfIntrest();
}
class SBI extends Bank{
    void rateOfIntrest(){
        System.out.println("SBI: 8% is the rate of intrest");
    }
}
class UNION extends Bank{
    void rateOfIntrest(){
        System.out.println("Union: 10% is the rate of intrest");
    }
}
class AXIS extends Bank{
    void rateOfIntrest(){
        System.out.println("Axis: 12% is the rate of intrest");
    }
}
class BankAbstract{
    public static void main(String args[]){
        Bank sbi = new SBI();
        Bank union = new UNION();
        Bank axis = new AXIS();
        sbi.rateOfIntrest();
        union.rateOfIntrest();
        axis.rateOfIntrest();
    }
}