
public class Month extends Appointment
{
    
    public Month (int y, int m, int d, String des)
    {
        super(y, m, d, des);
    }

    public boolean OccursOn(int year, int month, int day)
    {
        if (getMonth () == month)
        {
            return true;
        }
            else
            {
                return false;
        }
    }
    
    
    
            
}

