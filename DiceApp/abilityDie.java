public class abilityDie
{
  private final int sides = 8;
  Dice ablDie;

  public abilityDie()
  {
    ablDie = new Dice(sides);
  }

  public string genOutCome()
  {
    int outCome;
    int roll = ablDie.roll();

    switch (roll)
    {
      case 1: outCome = 0;
      break;

      case 2: outCome = 1;
      break;

      case 3: outCome = 1;
      break;

      case 4: outCome = 2;
      break;

      case 5: outCome = 3;
      break;

      case 6: outCome = 3;
      break;

      case 7: outCome = 5;
      break;

      case 8: outCome = 4;
      break;
    }

    return outCome;
  }
}
