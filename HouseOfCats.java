int[] houseOfCats(int legs) {
    List <Integer> numberOfPeople = new ArrayList<>();
    while(legs >= 0) {
        numberOfPeople.add(legs/2);
        legs -= 4;
    }
    int [] result = new int [numberOfPeople.size()];
    for(int i = 0; i < result.length; i++)
        result[i] = numberOfPeople.get(i);
    Arrays.sort(result);
    return result;
}
