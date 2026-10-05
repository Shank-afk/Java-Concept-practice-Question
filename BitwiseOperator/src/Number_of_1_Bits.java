void main() {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number : ");
    int input = sc.nextInt();

    NumberOfOneBits(input);
}

public void NumberOfOneBits(int input){
    int count=0;

    while(input!=0){
        input = input & (input - 1);
        count++;
    }
    System.out.println("Number of 1 bits : " +count);
}