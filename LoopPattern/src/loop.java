void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Square to print : ");
    int size = sc.nextInt();

    RightAlignedTriangle(size);
}

public void RightAlignedTriangle(int size){
    for(int i=0; i<size; i++){
        for(int j=0; j<size-i; j++){
            System.out.print(" ");
        }
        for (int j=0; j<i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}