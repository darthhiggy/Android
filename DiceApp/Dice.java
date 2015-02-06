import java.util.Random;

public class Dice
{
  private int sides;

  public Dice(int num)
  {
    sides = num;
  }

  public int getSides()
  {
    return sides;
  }

  public int roll()
  {
    Random dieRoll = new Random();
    return dieRoll.nextInt(sides) + 1;
  }
}
