class MinMax {
    public void checkArraySize(long[] numbers){
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
    }

    public long getSum(long[] numbers){
        checkArraySize(numbers);
        long sum = 0;
        for (int index = 0; index < numbers.length; index++) {
            sum += numbers[index];
        }
        return sum;
    }

    public long getMaxSum(long[] numbers){
        checkArraySize(numbers);
        long min = numbers[0];

        for (int index = 1; index < numbers.length; index++) {
            if(numbers[index] < min)
                min = numbers[index];
        }

        long sum = getSum(numbers);

        return sum - min;
    }

    public long getMinSum(long[] numbers){
        checkArraySize(numbers);
        long max = numbers[0];

        for (int index = 1; index < numbers.length; index++) {
            if(numbers[index] > max)
                max = numbers[index];
        }

        long sum = getSum(numbers);

        return sum - max;
    }

}
