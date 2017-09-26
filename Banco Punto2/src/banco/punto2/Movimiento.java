
package banco.punto2;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
/**
 *
 * @author Estudiante
 */
public class Movimiento {
     int Cantidad;
     int SaldoAnterior;
     Date date = new Date();
     Calendar fecha = Calendar.getInstance();
     int año;

    public Movimiento() {
        this.año = fecha.get(Calendar.YEAR);
    }
     }

