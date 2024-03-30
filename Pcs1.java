// Problem
// You are given the sequence of Nucleotides of one strand of DNA through a string SS of length NN. SS contains the character A, T, C, A, T, C, and GG only.
//   knows that:
// AA is complementary to TT.
// TT is complementary to AA.
// CC is complementary to GG.
// GG is complementary to CC.
// Using the string SS, determine the sequence of the complementary strand of the DNA.
// Input Format
// First line will contain TT, number of test cases. Then the test cases follow.
// First line of each test case contains an integer NN - denoting the length of string SS.
// Second line contains NN characters denoting the string SS.
// Output Format
// For each test case, output the string containing NN characters - sequence of nucleotides of the complementary strand.
// Constraints
// 1≤T≤100
// 1≤N≤100
// S contains A, T, C, and G only
// Sample 1:
// Input
// 4
// 4
// ATCG
// 4
// GTCC
// 5
// AAAAA
// 3
// TAC

// Output

// TAGC
// CAGG
// TTTTT
// ATG


import java.util.*;
import java.lang.*;
import java.io.*;
public class Pcs1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(br.readLine());
        while(t>0)
        {
            int n = Integer.parseInt(br.readLine());
            String s =br.readLine();
            String ans = "";
            for(int i=0;i<n;i++)
            {
                if(s.charAt(i)=='A')
                    ans = ans+'T';
                else if (s.charAt(i)=='T')
                    ans = ans+'A';
                else if (s.charAt(i)=='G')
                    ans = ans+'C';
                else if (s.charAt(i)=='C')
                    ans = ans+'G';

            }
            System.out.println(ans);
            t--;
        }
    }
}
