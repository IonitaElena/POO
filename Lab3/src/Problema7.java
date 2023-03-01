class ClockTime
{
    int hour,minute;
    ClockTime(int hour,int minute)
    {
        this.hour=hour;
        this.minute=minute;
    }
    int compTime(ClockTime ceas)
    {
        if(this.hour>ceas.hour)
        {
            return 1;
        }
        else if(this.hour==ceas.hour)
        {
            if(this.minute>ceas.minute)
            {
                return 1;
            }
            else if(this.minute==ceas.minute)
            {
                return 0;
            }
            return -1;
        }
        return -1;
    }
}
class Schedule
{
    ClockTime departure,arrival;
    Schedule(ClockTime departure, ClockTime arrival)
    {
        this.departure=new ClockTime(departure.hour,departure.minute);
        this.arrival=new ClockTime(arrival.hour,arrival.minute);
    }
    int TripTime()
    {
        if(this.arrival.compTime(this.departure)==-1)
        {
            return ((1440-(this.departure.hour*60+this.departure.minute))+(this.arrival.hour*60+this.arrival.minute));
        }
        else return (Math.abs((this.arrival.hour*60+this.arrival.minute)-(this.departure.hour*60+this.departure.minute)));
    }
}
class Route
{
    String origin,destination;
    Route(String origin, String destination)
    {
        this.origin=new String(origin);
        this.destination=new String(destination);
    }
    boolean isRetur(Route r)
    {
        return(this.origin.equals(r.destination) && this.destination.equals(r.origin));
    }
}
class Train
{
    Route r;
    Schedule s;
    boolean local;
    Train(Route r, Schedule s, boolean local)
    {
        this.r=new Route(r.origin,r.destination);
        this.s=new Schedule(s.departure,s.arrival);
        this.local=local;
    }
    int PretBilet()
    {
        if(this.local==true)
        {
            return (this.s.TripTime());
        }
        else return(2*this.s.TripTime());
    }
    public String toString()
    {
        String s="";
        String t1=""+this.s.arrival.hour;
        String t2=""+this.s.departure.hour;
        if(this.s.arrival.minute<10)
        {
            t1+=(":0"+this.s.arrival.minute);
        }
        else
        {
            t1+=(":"+this.s.arrival.minute);
        }
        if(this.s.departure.minute<10)
        {
            t2+=(":0"+this.s.departure.minute);
        }
        else
        {
            t2+=(":"+this.s.departure.minute);
        }
        s+=this.local+" "+this.r.origin+" ("+t2+") -> "+this.r.destination+" ("+t1+") "+this.PretBilet()+" lei";
        return s;
    }
    public static void main(String args[])
    {
        Train local1=new Train(new Route("Bucuresti", "Galati"),new Schedule(new ClockTime(9, 35),new ClockTime(12, 2)), true);
        Train local2=new Train(new Route("Galati", "Bucuresti"),new Schedule(new ClockTime(5, 45),new ClockTime(12, 49)), true);
        Train inter=new Train(new Route("Bucuresti", "Braila"),new Schedule(new ClockTime(23, 45),new ClockTime(17, 0)), false);
        System.out.println(local1);
        System.out.println(local2);
        System.out.println(inter);
        System.out.println(local1.r.isRetur(local2.r));
    }

}
