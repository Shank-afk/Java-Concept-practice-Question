void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Square to print : ");
    int size = sc.nextInt();

    InvertedLeftAlignedTriangle(size);
}

public void InvertedLeftAlignedTriangle(int size){
    for(int i=size; i>0; i--){
        for(int j=i; j>0; j--){
            System.out.print("* ");
        }
        System.out.println();
    }
}