public class setbackDie
{
  private final int sides = 6;
  Dice sbDie;

  public setbackDie()
  {
    sbDie = new Dice(sides);
  }

  public string genOutCome()
  {
    int outCome;
    int roll = sbDie.roll();

    switch (roll)
    {
      case 1: outCome = 0;
      break;

      case 2: outCome = 0;
      break;

      case 3: outCome = -1;
      break;

      case 4: outCome = -1;
      break;

      case 5: outCome = -3;
      break;

      case 6: outCome = -3;
      break;
    }

    return outCome;
  }
}
