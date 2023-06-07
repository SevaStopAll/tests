public class Quadrants {

    public static int quadrant(int x, int y) {
        if (x > 0 && y > 0) {
            return 1;
        }
        else if (x > 0 && y < 0) {
            return 4;
        }
        else if (x < 0 && y < 0) {
            return 3;
        }
        return 2;
    }
}
