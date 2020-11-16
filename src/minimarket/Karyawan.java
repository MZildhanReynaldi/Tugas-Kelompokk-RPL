
package minimarket;

import java.util.*;

public class Karyawan {
    
    private String nama;
    private String pangkat;
    private int gaji;
    private List< Karyawan > subordinates;
    
    public Karyawan(String nama, String pangkat, int gaji){
        this.nama = nama;
        this.pangkat = pangkat;
        this.gaji = gaji;
        subordinates = new ArrayList< Karyawan >();
    }
    
    public void add(Karyawan add){
        subordinates.add(add);
    }
    
    public void remove(Karyawan remove){
        subordinates.remove(remove);
    }
    
    public List< Karyawan > getSubordinates(){
        return subordinates;
    }
    
    @Override
    public String toString(){
        return (" Nama : " + nama + ", Pangkat : " + pangkat + ", Gaji : Rp " + gaji+"");
    }
}


