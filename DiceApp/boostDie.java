public class boostDie
{
  private final int sides = 6;
  Dice bstDie;

  public boostDie()
  {
    bstDie = new Dice(sides);
  }

  public string genOutCome()
  {
    int outCome;
    int roll = bstDie.roll();

    switch (roll)
    {
      case 1: outCome = 0;
      break;

      case 2: outCome = 0;
      break;

      case 3: outCome = 4;
      break;

      case 4: outCome = 3;
      break;

      case 5: outCome = 5;
      break;

      case 6: outCome = 1;
      break;
    }

    return outCome;
  }
}
