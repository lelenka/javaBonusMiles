public class BonusMilesService {
    public static int calculate(int price) {
        int calculate;
        if (price >= 20) {
            int miles = 20;
            calculate = (price / miles);
        } else calculate = 0;

        return calculate;
    }
}