import java.util.Scanner;

public class Determinant_Solver {

    public static float det2x2(float[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }

    public static float det3x3(float[][] matrix) {
        return (matrix[0][0] * ((matrix[1][1] * matrix[2][2]) - (matrix[1][2] * matrix[2][1])))
             - (matrix[0][1] * ((matrix[1][0] * matrix[2][2]) - (matrix[1][2] * matrix[2][0])))
             + (matrix[0][2] * ((matrix[1][0] * matrix[2][1]) - (matrix[1][1] * matrix[2][0])));
    }

    public static float det4x4(float[][] matrix) {
        float minorA00 = det3x3(new float[][] {
            {matrix[1][1], matrix[1][2], matrix[1][3]},
            {matrix[2][1], matrix[2][2], matrix[2][3]},
            {matrix[3][1], matrix[3][2], matrix[3][3]}
        });
        float minorA01 = det3x3(new float[][] {
            {matrix[1][0], matrix[1][2], matrix[1][3]},
            {matrix[2][0], matrix[2][2], matrix[2][3]},
            {matrix[3][0], matrix[3][2], matrix[3][3]}
        });
        float minorA02 = det3x3(new float[][] {
            {matrix[1][0], matrix[1][1], matrix[1][3]},
            {matrix[2][0], matrix[2][1], matrix[2][3]},
            {matrix[3][0], matrix[3][1], matrix[3][3]}
        });
        float minorA03 = det3x3(new float[][] {
            {matrix[1][0], matrix[1][1], matrix[1][2]},
            {matrix[2][0], matrix[2][1], matrix[2][2]},
            {matrix[3][0], matrix[3][1], matrix[3][2]}
        });
        return (matrix[0][0] * minorA00) - (matrix[0][1] * minorA01) 
             + (matrix[0][2] * minorA02) - (matrix[0][3] * minorA03);
    }

    public static float det5x5(float[][] matrix) {
        float minorA00 = det4x4(new float[][] {
            {matrix[1][1], matrix[1][2], matrix[1][3], matrix[1][4]},
            {matrix[2][1], matrix[2][2], matrix[2][3], matrix[2][4]},
            {matrix[3][1], matrix[3][2], matrix[3][3], matrix[3][4]},
            {matrix[4][1], matrix[4][2], matrix[4][3], matrix[4][4]}
        });
        float minorA01 = det4x4(new float[][] {
            {matrix[1][0], matrix[1][2], matrix[1][3], matrix[1][4]},
            {matrix[2][0], matrix[2][2], matrix[2][3], matrix[2][4]},
            {matrix[3][0], matrix[3][2], matrix[3][3], matrix[3][4]},
            {matrix[4][0], matrix[4][2], matrix[4][3], matrix[4][4]}
        });
        float minorA02 = det4x4(new float[][] {
            {matrix[1][0], matrix[1][1], matrix[1][3], matrix[1][4]},
            {matrix[2][0], matrix[2][1], matrix[2][3], matrix[2][4]},
            {matrix[3][0], matrix[3][1], matrix[3][3], matrix[3][4]},
            {matrix[4][0], matrix[4][1], matrix[4][3], matrix[4][4]}
        });
        float minorA03 = det4x4(new float[][] {
            {matrix[1][0], matrix[1][1], matrix[1][2], matrix[1][4]},
            {matrix[2][0], matrix[2][1], matrix[2][2], matrix[2][4]},
            {matrix[3][0], matrix[3][1], matrix[3][2], matrix[3][4]},
            {matrix[4][0], matrix[4][1], matrix[4][2], matrix[4][4]}
        });
        float minorA04 = det4x4(new float[][] {
            {matrix[1][0], matrix[1][1], matrix[1][2], matrix[1][3]},
            {matrix[2][0], matrix[2][1], matrix[2][2], matrix[2][3]},
            {matrix[3][0], matrix[3][1], matrix[3][2], matrix[3][3]},
            {matrix[4][0], matrix[4][1], matrix[4][2], matrix[4][3]}
        });
        return (matrix[0][0] * minorA00) - (matrix[0][1] * minorA01) 
             + (matrix[0][2] * minorA02) - (matrix[0][3] * minorA03) 
             + (matrix[0][4] * minorA04);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Hello, I am Sayan. Welcome to my project Determinant Solver!");

        do {
            System.out.println("For 2x2, enter 2\nFor 3x3, enter 3\nFor 4x4, enter 4\nFor 5x5, enter 5\nEnter 0 to exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Thank you! See you soon!");
                break;
            }

            if (choice == 2) {
                float[][] matrix = new float[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        System.out.print("Matrix[" + (i + 1) + "][" + (j + 1) + "]: ");
                        matrix[i][j] = scanner.nextFloat();
                    }
                }
                System.out.printf("Determinant: %.2f\n", det2x2(matrix));
            } else if (choice == 3) {
                float[][] matrix = new float[3][3];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print("Matrix[" + (i + 1) + "][" + (j + 1) + "]: ");
                        matrix[i][j] = scanner.nextFloat();
                    }
                }
                System.out.printf("Determinant: %.2f\n", det3x3(matrix));
            } else if (choice == 4) {
                float[][] matrix = new float[4][4];
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.print("Matrix[" + (i + 1) + "][" + (j + 1) + "]: ");
                        matrix[i][j] = scanner.nextFloat();
                    }
                }
                System.out.printf("Determinant: %.2f\n", det4x4(matrix));
            } else if (choice == 5) {
                float[][] matrix = new float[5][5];
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print("Matrix[" + (i + 1) + "][" + (j + 1) + "]: ");
                        matrix[i][j] = scanner.nextFloat();
                    }
                }
                System.out.printf("Determinant: %.2f\n", det5x5(matrix));
            } else {
                System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
