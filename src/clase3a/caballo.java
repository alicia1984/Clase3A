/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3a;

/**
 *
 * @author LP 13
 */
public class caballo 
{
  String altura;
  String color;
  String peso;
  String raza;
  
  int patas = 4, edad;
  //metodo  constructor
  public caballo(String nuevoNombre )
  {
      raza = nuevoNombre;
  }
  //metodos get y set  de la clase
  
       
   public void relinchar()     
  {   
  }
          
     public String obtenerRaza()         
     {
     //Sentencia obligatoria de retorno
      
         return raza;
     }     
        public int obtenerEdad()
        {
        return edad;
        }
   
}
