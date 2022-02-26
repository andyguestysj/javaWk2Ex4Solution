public class Time {
  int hour;
  int minute;

  public Time(int hour, int minute){
    if ((hour>23)||(minute>59))
    {
      this.hour = 0;
      this.minute = 0; 
    }
    else
    {
      this.hour = hour;
      this.minute = minute;             
    }
  }

  public void addMinutes(int minutesAdded){

    // lets use integer division to our advantage.
    // if we integer divide the minutesAdded by 60 we get the number of hours in addedMinutes
    // if we take the modules (remainder) when we integer divide minutesAdded by 60 we get the 
    //    minutes left over when we remove the hours
    // e.g addedMinutes = 150
    // addedMinutes / 60 = 2  => 2 hours
    // addedMinutes % 60 = 30 => 30 minutes
    // 150 minutes = 2 hours and 30 minutes

    hour += (minutesAdded / 60);
    minute += (minutesAdded % 60);

    // at this point we might have a problem, we added at most 59 to minute but minute could have
    // been up to 59 before we did, we might have more than 59 now!

    // so we'll repeat the same trick, well add minute / 60 to the hour and set minute to minute % 60
    
    hour += (minute/60);
    minute = minute % 60;

    // Now we have one last potential problem, our hours might be more than 23. After 23:59 we want to roll round to 00:00
    // And we can use the same trick once again!

    hour = hour % 24;
  }

  public void addTime(Time other){
    // We can do this a number of different ways - we can add the hours together and the minutes together and then
    // go through the process we went through in addMinutes to make sure the date is in the right range 00:00 -> 23:59
    
    // But programmers are lazy and like to resuse code wherever possible and that's what I'm going to do
    // X hours and Y minutes is (X*60)+Y minutes and we already have a method for adding minutes!

    this.addMinutes((other.hour*60)+other.minute);
  }

  public void subtractTime(Time other){
    // This will involve a lot of checking to see what we are doing.
    this.minute -= other.minute;
    if (this.minute<0)
    {
      this.minute +=60;
      this.hour -= 1;
      if (this.hour<0)
      {
        this.hour += 24;
      }
    }
    this.hour -= other.hour;
    if (this.hour<0)
    {
      this.hour += 24;
    }
  }

  public String toString(){    
    return (String.format("%02d", hour) + ":" + String.format("%02d", minute));
  }

  

}