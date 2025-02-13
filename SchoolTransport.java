import java.util.List;
import java.util.ArrayList;

public class SchoolTransport{
    private List<SchoolBus> busses = new ArrayList<>();
    
public void addBus (SchoolBus bus){
    busses.add(bus);
    
}
  
public boolean enroll(Student student)
{
    for (SchoolBus bus : busses){ 
        if ( bus.isFull()) { 
            continue; 
        }
        
        for ( Student s : bus){
            if ( !s.getStreet().equalsIgnoreCase(student.getStreet())){
                continue; 
            }
                if( s.Distance(student) <= student.Distance(s)){
                    bus.add(student);
                    return true;
                }
              
        }


    }
        return false;
}
}
