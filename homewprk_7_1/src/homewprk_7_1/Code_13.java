package homewprk_7_1;

import java.util.Scanner;

public class Code_13 {

	public static void main(String[] args){
        double[][] nums = new double[3][4];
        System.out.print("Enter the number of rows and columns in the array: ");
        @SuppressWarnings("resource")
		Scanner cin = new Scanner(System.in);
        int rows = cin.nextInt();
        int columns = cin.nextInt();
        System.out.println("Enter the array: ");
        for(int i = 0; i < rows; ++i){
            for(int j = 0; j < columns; ++j){
                nums[i][j] = cin.nextDouble();
            }
        }

        Location location = locateLargest(nums);
        System.out.println("The location of the largest element is " + location.maxValue + " at (" + location.row + "," + location.column + ")");
    }

    public static Location locateLargest(double[][] a){
        int x = 0,y = 0;
        double max = 0;
        for(int i = 0; i < a.length; ++i){
            for(int j = 0; j < a[i].length; ++j){
                if(a[i][j] > max){
                    max = a[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        Location temp = new Location();
        temp.row = x;
        temp.column = y;
        temp.maxValue = max;
        return temp;
    }
}
class Location{
    public int row,column;
    public double maxValue;
}
