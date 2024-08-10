public class eb_reading {
    public int reading(){
        int consumed_units=140;
        return consumed_units;
    }
    public int calculate(int consumed_units){
        int ammount=0;
        int rate1=1;
        int rate2=2;
        int rate3=3;
        if(consumed_units<=100){
            ammount=ammount*rate1;

        }
        else if(consumed_units<=200){
            ammount=(100*rate1)+(consumed_units-100)*rate2;

        }
        else{
            ammount=(100*rate1)+(consumed_units-100)*rate3;
        }
        return ammount;


    }
    public static void main(String[] args) {
        eb_reading assessor=new eb_reading();

        int consumed_units=assessor.reading();
        int ammount=assessor.calculate(consumed_units);
        
        System.out.println(ammount);   


    }
    
}
