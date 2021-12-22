import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner;  
public class Matrices {  
	static Scanner scanner;  
public static void main(String[] args) {  
// Read data from inputs.txt file placed in src directory(package)  
File inputFile = new File(".//src//inputs.txt");  
try {  
scanner = new Scanner(inputFile);  
} 
catch (FileNotFoundException e) 
{  
System.out.println("inputs.txt file not found");  
e.printStackTrace();  
}  
// Read Matrices from inputs.txt file  
System.out.println("Reading data from inputs.txt file placed in src directory(package)");  
// Read first matrix  // Read the number of rows  
int rows, columns;  
rows = scanner.nextInt();  // Read the number of columns  
columns = scanner.nextInt();  // Read first Matrix  
int[][] a = readMatrix(rows, columns);  // Read the second matrix  
rows = scanner.nextInt();  // Read the number of columns  
columns = scanner.nextInt();  // Read first Matrix  
int[][] b = readMatrix(rows, columns);  
// Read the third matrix  
rows = scanner.nextInt();  // Read the number of columns  
columns = scanner.nextInt();  // Read first Matrix  
int[][] c = readMatrix(rows, columns);  
// Generate a forth matrix with random number generator  
int[][] d = generateMatrix(4, 4);  
// Print input Matrices  
System.out.println();  
System.out.println(" ******* Matrix A *******");  
printMatrix(a);  System.out.println();  
System.out.println(" ******* Matrix B *******");  
printMatrix(b);  System.out.println();  
System.out.println(" ******* Matrix C *******");  
printMatrix(c);  System.out.println();  
System.out.println(" ******* Matrix D *******");  
printMatrix(d);  }  
// reads a matrix  
public static int[][] readMatrix(int rows, int columns) {  
	int[][] result = new int[rows][columns];  
	for (int i = 0; i < rows; i++) {  
		for (int j = 0; j < columns; j++) {  
			result[i][j] = scanner.nextInt();  
}  
		}  
	return result;  
}  
static // generate and return a random M-by-N matrix with values between 1 and 100  public static 
int[][] generateMatrix(int rows, int columns) {  
	int[][] result = new int[rows][columns];  
	for (int i = 0; i < rows; i++) {  
		for (int j = 0; j < columns; j++) {  
			result[i][j] = (int) (Math.random() * 100) + 1;  
}  
		}  
	return result;  
}  
// prints a matrix  
public static void printMatrix(int[][] matrix) {  
	int rows = matrix.length;  
	int columns = matrix[0].length;  
	for (int i = 0; i < rows; i++) {  
		for (int j = 0; j < columns; j++) {  
			System.out.printf("%6d ", matrix[i][j]);  
}  
System.out.println();  
}  
}  
// returns a * b  
public static int[][] multiply(int[][] a, int[][] b) {
	int rows = a.length;  
	int columns = a[0].length;
	int [][] result=new int[rows][columns];
	for (int i = 0; i < rows; i++) {  
		for (int j = 0; j < columns; j++) {  
		result[i][j]= a[i][j]*b[j][i];  
}  
		  
}  
	return result;
}  
// returns the transpose of a  
public static int[][] transpose(int[][] a) {  
	int rows = a.length;  
	int columns = a[0].length;
	int [][] result=new int[rows][columns];
	for (int i = 0; i < rows; i++) {  
		for (int j = 0; j < columns; j++) {  
		result[i][j]= a[j][i];  
}  
		  
}
	return result;
}  
// returns a + b  
public static int[][] add(int[][] a, int[][] b) {
	int rows = a.length;  
	int columns = a[0].length;
	int [][] result=new int[rows][columns];
	for (int i = 0; i < rows; i++) {  
		for (int j = 0; j < columns; j++) {  
		result[i][j]= a[i][j]+b[i][j];  
}  
		  
}
	
	return result;
}  
// returns a - b  
public static int[][] subtract(int[][] a, int[][] b) {  
	int rows = a.length;  
	int columns = a[0].length;
	int [][] result=new int[rows][columns];
	for (int i = 0; i < rows; i++) {  
		for (int j = 0; j < columns; j++) {  
		result[i][j]= a[i][j]-b[i][j];  
}  
		  
}
	
	return result;
}  
}  