/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueva;

import dao.MascotaDao;
import entidades.Mascota;

/**
 *
 * @author IESTP TRENTINO
 */
public class Ejemplo1 {
    public static void main(String[] args){
        MascotaDao mascotadao = new MascotaDao();
        
        Mascota mimascota = new Mascota(1, "Firulais", "Yessica", "Pastor Aleman");
        
        mascotadao.guardarMascota(mimascota);
    }
    
}
