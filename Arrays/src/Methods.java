/*Arrays methods*/
class Methods {

    public int getValueAtIndex(int[] arr, int index) {
        return arr[index];
    }

    public void printValues(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(i+1 + ". element of the array is: " + arr[i]);
            if(i == arr.length - 1)
                System.out.println("; ");
            else
                System.out.print(", ");
        }
    }

    public int sumValues(int[] arr){
        int sum = 0;

        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    public int[] getEvenElements(int[] arr){
        int size;
        /*Determening if the array size is even or uneven*/
        if(arr.length%2 == 1)
            size = (arr.length - 1) / 2;
        else
            size = arr.length / 2;

        int[] evenArr = new int[size];

        int j = 0; //index for the new Array
        for (int i = 0; i < arr.length; i++)
        {

            if(i%2 == 1) {
                evenArr[j] = arr[i];
                j++;
            }
        }
        return evenArr;
    }

    public int[] getBiggerThanAverage(int[] arr){
        double avg;
        int sum = sumValues(arr);
        avg = (double) sum / arr.length;
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > avg)
                j++;
        }

        int[] biggerArray = new int[j];
        j = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > avg){
                biggerArray[j] = arr[i];
                j++;
            }
        }

        return biggerArray;
    }

    public int[] reverseArray(int[] arr) {
        int helper;
        int j = arr.length - 1;
        for (int i = 0; i < arr.length/2; i++){
            helper = arr[i];
            arr[i] = arr[j];
            arr[j] = helper;
            j--;
        }
        return arr;
    }

    public int[] getSwappedElements(int[] arr) {
        int helper;
        int i = 0;
        while(i < arr.length -1){
            helper = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = helper;
            i+=2;
        }
        return arr;
    }

    public void sortArray(int arr[]){
        int helper;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    helper = arr[i];
                    arr[i] = arr[j];
                    arr[j] = helper;
                }
            }
        }
    }

}