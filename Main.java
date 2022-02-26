class Main {
  public static void main(String[] args) {
    
    Time myTime1 = new Time(22,30);

    System.out.println(myTime1.toString());
    myTime1.addMinutes(10);
    System.out.println(myTime1.toString());
    myTime1.addMinutes(180);
    System.out.println(myTime1.toString());
    System.out.println("==========");

    Time myTime2 = new Time(0,30);
    Time myTime3 = new Time(1,00);

    System.out.println(myTime2.toString());
    System.out.println("Subtract " + myTime3.toString());
    myTime2.subtractTime(myTime3);
    System.out.println(myTime2.toString());

    Time myTime4 = new Time(0,30);
    Time myTime5 = new Time(0,45);

    System.out.println(myTime4.toString());
    System.out.println("Subtract " + myTime5.toString());
    myTime4.subtractTime(myTime5);
    System.out.println(myTime4.toString());


  }
}