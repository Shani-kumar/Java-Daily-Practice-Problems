// Que-1  *********************
// Amit got an assignment where he need to determine whether a given integer is prime number or not. Write a java programming solution to help Amit.

// Input Format

// First Line contain one integer number N

// Constraints

// N should be positive

// Output Format

// Return "Prime Number" incase integer is a prime number or return "Not Prime Number" incase it is not.

// Sample Input 0

// 3
// Sample Output 0

// Prime Number
// Sample Input 1

// 4
// Sample Output 1

// Not Prime Number

/********************************************************************************************************/
// import java.util.*;
// public class Main {

//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int num = sc.nextInt();
//       if(num<0){
//           return;
//       }
//       if(num==0|| num==1){
//           System.out.println("Not Prime Number");
//           return;
//       }

//     boolean flag = false;
//     for (int i = 2; i <= num / 2; ++i) {
//       if (num % i == 0) {
//         flag = true;
//         break;
//       }
//     }
//     if (!flag)
//       System.out.println("Prime Number");
//     else
//       System.out.println("Not Prime Number");
//   }
// }
/********************************************************************************************************/

//Que-2  *************************************************

// Peter asked his friend Max to implement a Java program in which 3 integers X, Y and N are given as a runtime input and all the numbers between X and Y which are divisible by N must be displayed on console. If no such number is possible for the given input then, print NO OUTPUT.

// Input Format

// 3 space separated integers X, Y and N

// Constraints

// X, Y and N are less than 1000

// X and Y are positive integers and X < Y

// Output Format

// All the integers between X and Y separated by space which are divisible by N

// Sample Input 0

// 6 11 3
// Sample Output 0

// 6 9
// Sample Input 1

// 2 6 2
// Sample Output 1

// 2 4 6

/********************************************************************************************************/

// import java.io.*;
// import java.util.*;

// public class Solution {

//   static void find(int X, int Y, int N) {
//     int count = 0;
//     for (int i = X; i <= Y; i++) {
//       if (i % N == 0) {
//         System.out.print(i + " ");
//         count++;
//       }
//     }
//     if (count == 0) {
//       System.out.print("NO OUTPUT");
//     }

//   }

//   public static void main(String[] args) {

//     Scanner sc = new Scanner(System.in);
//     int X = sc.nextInt();
//     int Y = sc.nextInt();
//     int N = sc.nextInt();

//     find(X, Y, N);

//   }

// }

/********************************************************************************************************/