public class BonusMilesService {
    int forMiles = 20;
    public int calculate(int cost) {

        int bonus = cost / forMiles;
        return bonus;

    }
}
