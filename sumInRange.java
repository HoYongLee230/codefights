int sumInRange(int[] nums, int[][] queries) {
    long sum = 0;
    int prefixSum = 0, M = 1000000007;
    int [] numsPrefix = new int[nums.length];
    for(int j = 0; j < nums.length; j++) {
        prefixSum += nums[j];
        numsPrefix[j] = prefixSum;
    }
    for(int i = 0; i < queries.length; i++)
        sum += numsPrefix[queries[i][1]] - (queries[i][0] == 0?0:numsPrefix[queries[i][0]-1]);
    return (int)((sum % M) + M) % M;
}
