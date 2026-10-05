void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array : ");
    int size = sc.nextInt();

    int[] nums = new int[size];
    for (int i=0;i<nums.length;i++){
        System.out.print("Enter the element at index "+ i + " : ");
        nums[i]= sc.nextInt();
    }

    System.out.println(SingleNumber(nums));
}

public int SingleNumber(int[] nums){
    int SingleNumber=0;
    for (int num : nums) {
        SingleNumber = SingleNumber ^ num;
    }
    return SingleNumber;
}