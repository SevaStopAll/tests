
public class AntsMoving {

    public static int whenAntFalls(int length, int leftMoving, int rightMoving) {
        if (leftMoving == rightMoving) {
            throw new IllegalArgumentException("The ants have to start in different points");
        }
        int roundsBeforeFall = 0;

        while(true) {
            if (leftMoving - 1 == rightMoving || rightMoving + 1 == leftMoving) {
                leftMoving = leftMoving ^ rightMoving;
                rightMoving = leftMoving ^ rightMoving;
                leftMoving = leftMoving ^ rightMoving;
            }
            roundsBeforeFall++;
            leftMoving--;
            if (leftMoving - 1 == rightMoving) {
                leftMoving = leftMoving ^ rightMoving;
                rightMoving = leftMoving ^ rightMoving;
                leftMoving = leftMoving ^ rightMoving;
            }
            rightMoving++;
            if (rightMoving + 1 == leftMoving) {
                leftMoving = leftMoving ^ rightMoving;
                rightMoving = leftMoving ^ rightMoving;
                leftMoving = leftMoving ^ rightMoving;
            }

            if(leftMoving == -1 || leftMoving == length + 1) {
                return roundsBeforeFall;
            }
            if (rightMoving == -1 || rightMoving == length + 1) {
                return roundsBeforeFall;
            }
        }
    }
    //test case
    public static void main(String[] args) {
        System.out.println(AntsMoving.whenAntFalls(3, 3, 1));
    }
}
