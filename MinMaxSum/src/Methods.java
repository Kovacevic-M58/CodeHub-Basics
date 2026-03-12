class Methods {
    public long getSum(long[] numbers){
        long sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public long getMaxSum(long[] numbers){
        long min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] < min)
                min = numbers[i];
        }

        long sum = getSum(numbers);

        return sum - min;
    }

    public long getMinSum(long[] numbers){
        long max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max)
                max = numbers[i];
        }

        long sum = getSum(numbers);

        return sum - max;
    }

}
