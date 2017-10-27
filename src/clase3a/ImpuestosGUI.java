/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3a;
//import java.util.sacanner
//paquete para implementar ventanas graficas de usuario
import javax.swing.JOptionPane;
/**
 *
 * @author LP 13
 */
public class ImpuestosGUI
{
  public ImpuestosGUI() //constructor
  {
  
  }
  public static void main (String[] args)
  {
      int sueldo;
      
      //Scanner escaner = new Scanner(System.in);
     // System.out.println("Ingrese  su  salario");
     //convertimos  el  entero  antes  de guardarlo
     sueldo = Integer.parseInt(JOptionPane.showInputDialog("ingrese salario"));
     // sueldo = escaner.nextInt();
      if (sueldo>600000)
      //System.out.println("Debe Pagar Impuestos");
      
      JOptionPane.showMessageDialog(null,"debe pagar  impuestos");
      
  }
}
