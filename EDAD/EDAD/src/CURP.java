import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class CURP {
 //PREGUNTARLE AL USUARIO SU CURP Y GUARDARLA EN UNA VARIABLE DE TIPO STRING LLAMADA CURP Y EXTRAER LA FECHA DE NACIMIENTO
    String curp = JOptionPane.showInputDialog("Ingresa tu CURP");
    //obtener la fecha de nacimiento de la persona a partir de su CURP
    String fechaNac = curp.substring(4, 10);
    //obtener el año de nacimiento de la persona a partir de su CURP
    String anioNac = fechaNac.substring(0, 2);
    //obtener el mes de nacimiento de la persona a partir de su CURP
    String mesNac = fechaNac.substring(2, 4);
    //obtener el dia de nacimiento de la persona a partir de su CURP
    String diaNac = fechaNac.substring(4, 6);

        public   int  calcularEdad() {
        //obtener el año actual
        Calendar fecha =  new  GregorianCalendar();
        int anio = 23;
        //obtener el mes actual
        int mes = fecha.get(Calendar.MONTH);
        //obtener el dia actual
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        //obtener la edad de la persona a partir de su CURP
        int edad = anio - Integer.parseInt(anioNac);
        //si el mes actual es menor que el mes de nacimiento, restarle un año a la edad
        if (mes < Integer.parseInt(mesNac)) {
            edad--;
        }  else   if (mes == Integer.parseInt(mesNac)) {
            //si el mes actual es igual al mes de nacimiento, verificar si el dia actual es menor que el dia de nacimiento
            if (dia < Integer.parseInt(diaNac)) {
                edad--;
            }
        }
        //regresar la edad de la persona
        return edad;
    }
}
