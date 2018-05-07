int arrayConversion(int[] inputArray) {
    for(int i = 0; i < Math.log(inputArray.length)/Math.log(2); i++) {
        for(int j = 0; j < inputArray.length; j += Math.pow(2, i + 1)) 
            inputArray[j] = i % 2 == 0?inputArray[j] + inputArray[j + (int)Math.pow(2, i)]:inputArray[j] * inputArray[j + (int)Math.pow(2, i)];
    }
    return inputArray[0];
}
