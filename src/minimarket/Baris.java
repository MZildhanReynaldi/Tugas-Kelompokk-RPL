package minimarket;
 
public abstract class Baris implements Cloneable {
 
    protected String barisName;
     
    abstract void isibaris();
     
    public Object clone(){
         
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return clone;
    }
}