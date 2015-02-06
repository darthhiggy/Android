public class Driver
{
  public static void main(String[] args)
  {
    Dice sixSided = new Dice(6);

    System.out.println(sixSided.getSides());

    for(int i = 0; i<6; i++)
    {
      System.out.println(sixSided.roll());
    }
  }
}
