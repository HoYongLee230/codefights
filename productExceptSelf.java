int productExceptSelf(int[] nums, int m) {
    int [] l = new int [nums.length], r = new int [nums.length];
    int res = 0;
    l[0] = 1; 
    r[nums.length - 1] = 1;
    for(int i = 1; i < nums.length; i++)
        l[i] = nums[i - 1]%m * l[i - 1]%m;
    for(int j = nums.length - 2; j >= 0; j--)
        r[j] = nums[j + 1]%m * r[j + 1]%m;
    for(int k = 0; k < nums.length; k++)
        res += (l[k]* r[k])%m;
    return res%m;
}
