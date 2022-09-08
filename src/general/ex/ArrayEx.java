package general.ex;

import java.util.Scanner;

public class ArrayEx {
	
	ArrayEx() {
		super();
	}

	public static void main(String args[]) {
		/*simpleArrayExample();

		int x[] = { 39, 48, 28, 98, 93 };
		passArrayExample(x);
		
		anonymousArrayEx(new int[]{93, 28, 84});
		
		int ar[] = returnArrayFromMethod();
		int i = 0;
		for (int arrayVariable : ar) {
			if (0 != arrayVariable) {
				System.out.println("Returning method from Array: a[" + i + "] = " + arrayVariable);
			}
		}
		
		
		multiDimensionalArrayEx();
		jaggedArrayEx();
		
		printArrayClassName();
		arrayCopyExMethod();
		arrayCloneExMethod();
		
		simpleMatricesEx();
		twoMatricesEx();
		
		double a = 18.0;
		double b = -3;
		//return (18) power of -3
		System.out.println(Math.pow(a, b));*/
		
		Object obj = (Object) returnArrayFromMethod();
		System.out.println(obj.getClass());
		
	}
	
	private static void twoMatricesEx() {
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter base of matrices");
		n = input.nextInt();
		int[][] m1 = new int[n][n];
		int[][] m2 = new int[n][n];
		int[][] mat = new int[n][n];
		System.out.println("Enter the elements of 1st matrix row wise : n");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				m1[i][j] = input.nextInt();
			}
		}
		System.out.println("Enter the elements of 2nd matrix row wise : n");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				m2[i][j] = input.nextInt();
			}
		}
		System.out.println("Multiplying the matrices : ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					mat[i][j] = mat[i][j] + m1[i][k] * m2[k][j];
				}
			}
		}
		System.out.println("Product :");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		input.close();

	}

	private static void simpleMatricesEx() {
		System.out.println("simpleMatricesEx Method: ");
		int a[][] = {{32, 10, 38}, {84, 48, 23}};
		int b[][] = {{32, 10, 38}, {84, 48, 23}};
		
		int c[][] = new int[2][3];
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static void arrayCloneExMethod() {
		System.out.println("ArrayCloneExMethod(): ");
		
		int arr[] = {23, 41, 73};
		System.out.println("Printing original Value: ");
		for (int array: arr) {
			System.out.println(array);
		}
		
		int arrClone[] = arr.clone();
		System.out.println("Print clone value: ");
		for (int array: arrClone) {
			System.out.println(array);
		}
		System.out.println("Both are equal? " + (arr == arrClone));
		
		int darr[][] = {{21, 89, 91}, {83, 23, 12}};
		int carrClone[][] = darr.clone();
		
		for (int i = 0; i< carrClone.length; i++) {
			for (int j = 0; j < carrClone.length; j++) {
				System.out.print(carrClone[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Both are equal in 2Dimensional? " + (darr == carrClone));
		
	}

	private static void arrayCopyExMethod() {
		System.out.println("ArraycopyEx method: ");
		char copyFrom[] = {'d', 'e', 's', 'h', 'e', 'x', 'v', 'l', 'g'};
		char copyTo[] = new char[6];
		
		System.arraycopy(copyFrom, 3, copyTo, 0, 6);
		System.out.println(String.valueOf(copyTo)+"G");
	}
	private static void printArrayClassName() {
		System.out.println("PrintArrayClassName method(): ");
		int arr[] = {4, 5, 2, 3, 88};
		
		Class cls = arr.getClass();
		String name = cls.getName();
		
		System.out.println(name);
	}

	private static void jaggedArrayEx() {
		int a[][] = new int[3][];
		System.out.println("Jagged Array example: ");
		System.out.println("Length of Jagged Array a[][]: " + a.length);
		a[0] = new int[3];
		a[1] = new int[5];
		a[2] = new int[7];
		
		int count = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = count++;
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static void multiDimensionalArrayEx() {
//		int a[][] = new int[3][3];
		
		int a[][] = {{4,8,3}, {23,53,1}, {85, 22, 12}};
//		a[2][1] = 10;
		System.out.println("Lenght of a[][]: " + a.length);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static int[] returnArrayFromMethod() {
		int arr[] = new int[5];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		return arr;
	}

	private static void anonymousArrayEx(int ex[]) {
		for (int variable: ex) {
			System.out.println("Anonymous example values: " + variable);
		}
	}

	private static void simpleArrayExample() {
		int[] a = new int[5];
		a[0] = 60;
		a[1] = 30;
		a[2] = 90;
		a[3] = 70;
		a[4] = 50;

		for (int i = 0; i < a.length; i++) {
			System.out.println("Simple Array value of " + (i + 1) + ": " + a[i]);
		}

		int[] b = { 79, 21, 26, 41 };
		for (int i = 0; i < b.length; i++) {
			System.out.println("Second Simple Array value of " + (i + 1) + ": " + b[i]);
		}

		int[] c = { 22, 78, 83, 48 };
		for (int refVariable : c) {
			System.out.println("Java Array for-each loop " + refVariable);
		}
	}

	private static void passArrayExample(int x[]) {
		int m = 1;
		for (int variable : x) {
			System.out.println("Pass Array variable into method - value of " + m++ + " is " + variable);
		}

		System.out.println("Find minimum in the array:");
		int min = x[0];

		for (int i = 1; i < x.length; i++) {
			if (min > x[i]) {
				min = x[i];
			}
		}
		System.out.println("The value of min is: " + min);
	}

}
