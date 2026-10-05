void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array : ");
    int size = sc.nextInt();

    int[] nums = new int[size];
    for (int i=0;i<nums.length;i++){
        System.out.print("Enter the element at index "+ i + " : ");
        nums[i]= sc.nextInt();
    }

    System.out.println((Arrays.toString(SingleNumber(nums))));
}

public int[] SingleNumber(int[] nums){
    if (nums.length==2){
        return nums;
    }

    int XoR=0;
    for (int num : nums) {
        XoR = XoR ^ num;
    }

    int mask = XoR & (XoR-1);

    int firstNum = 0;
    int secondNum = 0;

    for (int num : nums) {
        if ((num & mask) == 0) {
            firstNum ^= num;
        } else {
            secondNum ^= num;
        }
    }

    return new int[]{firstNum , secondNum};
}