boolean isSmooth(int[] arr) {
    return (arr.length % 2 == 0 && arr[0] == arr[arr.length - 1])?arr[0] == (arr[arr.length/2] + arr[arr.length/2 - 1]):(arr.length % 2 != 0 && arr[0] == arr[arr.length - 1])?arr[0] == arr[arr.length/2]:false;
}
