void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int input = sc.nextInt();

    PowerOfTwo(input);

}

public void PowerOfTwo(int input){
    int count=0;

    while(input!=0){
        input = input & (input - 1);
        count++;
    }
    boolean isPowerofTwo = count == 1;
    System.out.println("Number is in power of two  : " + isPowerofTwo);
}