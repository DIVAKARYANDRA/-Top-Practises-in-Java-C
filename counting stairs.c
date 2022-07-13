/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <stdio.h>
long int countWaysToStair(long int N);

int main()
{
    long int input ;
    scanf("%ld",&input);
    long int z = countWaysToStair(input);
    printf("%ld",z);

    return 0;
}
long int countWaysToStair(long int N)
{
    if(N == 1 || N == 2)
    return N;

    long int dp[N+1];

    dp[0] = 1;
    dp[1] = 1;

    dp[2] = 2;

    for(int i=3;i<=N;i++)
    {
      dp[i] = dp[i-1] + dp[i-2];
    } 
    return dp[N];
}
