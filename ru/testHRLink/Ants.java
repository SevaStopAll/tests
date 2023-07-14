/**
 * Please, give me a change. Because of excitement I sent you wrong answer first time.
 */

public class Ants {

    public static int antFalls(int length, int leftMoving, int rightMoving) {
        int roundsBeforeFall = 0;
        int firstPosition = leftMoving;
        int secondPosition = rightMoving;

        while(true) {
            if (firstPosition - 1 == secondPosition || secondPosition + 1 == firstPosition) {
                firstPosition = firstPosition ^ secondPosition;
                secondPosition = firstPosition ^ secondPosition;
                firstPosition = firstPosition ^ secondPosition;
            }
            roundsBeforeFall++;
            firstPosition--;
            if (firstPosition - 1 == secondPosition) {
                firstPosition = firstPosition ^ secondPosition;
                secondPosition = firstPosition ^ secondPosition;
                firstPosition = firstPosition ^ secondPosition;
            }
            secondPosition++;
            if (secondPosition + 1 == firstPosition) {
                firstPosition = firstPosition ^ secondPosition;
                secondPosition = firstPosition ^ secondPosition;
                firstPosition = firstPosition ^ secondPosition;
            }

            if(firstPosition == -1 || firstPosition == length + 1) {
                return roundsBeforeFall;
            }
            if (secondPosition == -1 || secondPosition == length + 1) {
                return roundsBeforeFall;
            }
        }
    }
    //test case
    public static void main(String[] args) {
        System.out.println(Ants.antFalls(4, 4, 1));
    }
}
