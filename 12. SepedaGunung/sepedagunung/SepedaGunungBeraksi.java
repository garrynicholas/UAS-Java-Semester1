/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sepedagunung;

/**
 *
 * @author USER
 */
public class SepedaGunungBeraksi {
   public static void main(String[] args) {
        SepedaGunung sg=new SepedaGunung();

        sg.setGir(3);
        System.out.println(sg.getGir());

        sg.setSadel(1);
        System.out.println(sg.getSadel());
    }
}
