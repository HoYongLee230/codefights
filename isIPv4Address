boolean isIPv4Address(String inputString) {
    String[] nums = inputString.split("\\.");
    for(int i = 0; i < nums.length; i++) {
        try {
            Integer.parseInt(nums[i]);
        } catch (NumberFormatException e) {
            return false;
        }
        if(Integer.parseInt(nums[i]) > 255 || Integer.parseInt(nums[i]) < 0)
            return false;
    }
    return nums.length == 4;
}
