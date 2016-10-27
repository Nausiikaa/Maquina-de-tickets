
/**
 * Write a description of class TrainStation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EstacionDeTren
{
    private MaquinaTickets maquina1;
    private MaquinaTickets maquina2;
    private int totalDinero;

    public EstacionDeTren()
    {
        maquina1 = new MaquinaTickets(300);
        maquina2 = new MaquinaTickets(200);
        totalDinero = 0;
  }
  
  public void imprimirDineroTotal()
    {
        totalDinero = maquina1.getTotal();
        totalDinero = totalDinero + maquina2.getTotal();
        System.out.println(totalDinero);
    }
  public void simularVentaTickets()
    {
        maquina1.insertDinero(300);
        maquina2.insertDinero(200);
        maquina1.printTicket();
        maquina2.printTicket();
    }
}