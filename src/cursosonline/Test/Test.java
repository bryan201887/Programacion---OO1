/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursosonline.Test;

import cursosonline.Dao.CursoDao;
import cursosonline.Dao.cursoDaoImp;
import cursosonline.entidades.Curso;


public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ingresar
        CursoDao  cursoD = new cursoDaoImp();
        Curso cursos=new Curso(0,"Estructura De Datos");
        cursoD.ingresar(cursos);
        //Actualizar
         /*Curso cursoss=new Curso(2,"redes de computadora");
        cursoD.actualizar(cursoss);*/
        // Eliminar 
        /*Curso cursosv=new Curso(2,"redes de computadora");
        cursoD.eliminar(2);*/
        for (Curso e : cursoD.getCursos()){
            System.out.println(e.getId() + "-" + e.getNombre());
            
    }
    }
}
