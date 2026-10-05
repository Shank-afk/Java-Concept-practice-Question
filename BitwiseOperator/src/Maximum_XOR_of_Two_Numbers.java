void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array : ");
    int size = sc.nextInt();

    int[] nums = new int[size];
    for (int i=0;i<nums.length;i++){
        System.out.print("Enter the element at index "+ i + " : ");
        nums[i]= sc.nextInt();
    }

    System.out.println(findMaximumXOR(nums));
}

public int findMaximumXOR(int[] nums) {

    int maxXor = 0;
    int mask = 0;

    // int has 32 bits, but nums are non-negative,
    // so we check from bit 30 down to bit 0.
    for (int bit = 30; bit >= 0; bit--) {

        // Include the current bit
        mask = mask | (1 << bit);

        Set<Integer> prefixes = new HashSet<>();


        for (int num : nums) {
            prefixes.add(num & mask);
        }

        int candidate = maxXor | (1 << bit);

        boolean found = false;

        for (int prefix : prefixes) {

            if (prefixes.contains(prefix ^ candidate)) {
                found = true;
                break;
            }
        }

        if (found) {
            maxXor = candidate;
        }
    }

    return maxXor;
}