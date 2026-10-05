void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Square to print : ");
    int size = sc.nextInt();

    LeftAlignedTriangle(size);
}

public void LeftAlignedTriangle(int size){
    for(int i=1; i<=size; i++){
        for(int  j=0; j<i; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}

