package Arrays;

import java.util.Arrays;

public class MovieTheaterImplementation {
    int[][] arr = null;

    public MovieTheaterImplementation(int numberOfRows, int numberOfCols) {
        arr = new int[numberOfRows][numberOfCols];

        for(int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[0].length; column++) {
                arr[row][column] = Integer.MIN_VALUE;
            }
        }
    }

    public void reserveSeat(int row, int column, int seatNumber) {
        try {
            if (arr[row][column] == Integer.MIN_VALUE) {
                arr[row][column] = seatNumber;
                System.out.println("Successfully reserved seat");
            } else {
                System.out.println("Seat already reserved, please choose an available seat");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index 2D array");
        }
    }

    public void cancelSeat(int row, int column) {
        try {
            arr[row][column] = Integer.MIN_VALUE;
            System.out.println("The seat is successfully cancelled");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The seat that is provided is not in the range of array");
        }
    }

    public static void main(String[] args) {
        MovieTheaterImplementation movieTheaterImplementation = new MovieTheaterImplementation(4,4);
        movieTheaterImplementation.reserveSeat(0,0,1);
        movieTheaterImplementation.reserveSeat(0,0,1);
        movieTheaterImplementation.reserveSeat(0, 2, 3);
        movieTheaterImplementation.reserveSeat(1, 1, 2);
        movieTheaterImplementation.reserveSeat(2, 0, 1);
        movieTheaterImplementation.reserveSeat(2, 1, 2);
        movieTheaterImplementation.reserveSeat(2, 3, 4);
        movieTheaterImplementation.cancelSeat(2,1);
        movieTheaterImplementation.reserveSeat(3,0, 1);
        movieTheaterImplementation.reserveSeat(3, 1, 2);
        movieTheaterImplementation.reserveSeat(3, 2, 3);
        movieTheaterImplementation.reserveSeat(3, 3, 4);

        for (int i = 0; i < movieTheaterImplementation.arr.length; i++) {
            System.out.println(Arrays.toString(movieTheaterImplementation.arr[i]));
        }
    }
}
