// Problem
// There are 1010 problems in a contest. You know that the score of each problem is either 11 or 100100 points.
//   came to know the total score of a participant and he is wondering how many problems were actually solved by that participant.
// Given the total score PP of the participant, determine the number of problems solved by the participant. Print -1−1 in case the score is invalid.
// Input Format
// First line will contain TT, number of test cases. Then the test cases follow.
// Each test case contains of a single line containing a single integer PP - denoting the number of points scored by the participant.
// Output Format
// For each testcase, output the number of problems solved by the participant or -1−1 if the score is invalid.
// Constraints
// 1≤T≤1000
// 0≤P≤1000
// Sample 1:
// Input
// 5
// 103
// 0
// 6
// 142
// 1000

// Output

// 4
// 0
// 6
// -1
// 10



import java.util.Scanner;
public class Pcs2 {
    public static int solve(int p) {
        int ans = 0;
        if (p >= 100) {
            ans += p / 100;
            p = p % 100;
        }

        if (p > 0) {
            ans += p;
        }
        if (ans > 10) {
            return -1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int p = scanner.nextInt();
            System.out.println(solve(p));
        }
        scanner.close();
    }
}
