import java.util.ArrayList;
public class SchoolBus extends ArrayList<Student>
{
  private int numSeats;

  public SchoolBus(int seats){
    super();    
    numSeats = seats; 
}
    public boolean isFull(){ 
        return super.size() < numSeats;
        }

    
}