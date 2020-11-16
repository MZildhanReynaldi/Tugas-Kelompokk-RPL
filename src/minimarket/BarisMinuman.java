package minimarket;
 
public class BarisMinuman extends Baris{
 
    public BarisMinuman() {
        this.barisName = "Minuman";
    }
 
    @Override
    void isibaris() {
        System.out.println("Baris Minuman");
    }
}