class SpecialIndex {
    public static void main(String[] args) {

        int[] arr = {2, 1, 6, 4};

        int n = arr.length;

        for(int i = 0; i < n; i++) {

            int evenSum = 0;
            int oddSum = 0;
            int newIndex = 0;

            for(int j = 0; j < n; j++) {

                if(i == j)
                    continue;

                if(newIndex % 2 == 0)
                    evenSum += arr[j];
                else
                    oddSum += arr[j];

                newIndex++;
            }

            if(evenSum == oddSum) {
                System.out.println(i + " is a Special Index");
            }
        }
    }
}