class Solution{
public:
int climbStairs(int n) {
    if (n <= 2) return n; // Base cases: 1 step -> 1 way, 2 steps -> 2 ways
    vector<int> dp(n + 1);
    dp[1] = 1;
    dp[2] = 2;
    for (int i = 3; i <= n; ++i) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
}
};
