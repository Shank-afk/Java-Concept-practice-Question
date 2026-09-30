
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Square to print : ");
    int size = sc.nextInt();

    SolidSquare(size);
}

void SolidSquare(int size){
    for (int i=0; i<size; i++){
        for(int j=0; j<size; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
