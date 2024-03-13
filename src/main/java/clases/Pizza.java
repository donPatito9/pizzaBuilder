/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Robinson Concha
 */
public class Pizza {
    private String masa = "";
    private String salsa = "";
    private String relleno = "";

  

    public void setMasa(String masa) {
        this.masa = masa;
    }

  

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

 

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }



    @Override
    public String toString() {
        return "Pizza [masa=" + masa + ", salsa=" + salsa + ", relleno=" + relleno + "]";
    }
    
}
