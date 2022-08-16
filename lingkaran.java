/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheri;

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class lingkaran
{
    public double jariJari ;
    public void setJariJari(double nilaiBaru){
        this.jariJari=nilaiBaru;
    }
    public double luaslingkaran(){
        return (3.14*jariJari*jariJari);
    }
    public double kelilinglingkaran(){
        return (2*3.14*jariJari);
}
}
