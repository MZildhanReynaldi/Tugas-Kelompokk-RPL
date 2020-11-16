package minimarket;

 
public class BarisMakanan extends Baris{
 
    public BarisMakanan() {
        this.barisName = "Makanan";
    }
 
    @Override
    void isibaris() {
        System.out.println("Baris Makanan Satu");
    }
}