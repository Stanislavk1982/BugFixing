package bug_5;

public class ArrayOutOfBoundExceptionTest {

    public static void main(String args[]) {
        int ram[] = {1, 2, 3, 4, 5};
        changeArray(ram);
        for (int y : ram) System.out.println("y: "+y);

    }

    public static void changeArray(int x[]) {
        for (int count = 0; count <= x.length-1; count++) {
            x[count] += 5;
        }

        for (int j : x) {
            System.out.println("j: "+j);
        }
    }

}
