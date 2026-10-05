void main() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of Square to print : ");
    int size = sc.nextInt();

    SolidDiamond(size);
}

public void SolidDiamond(int size){
    FullPyramid(size);
    InvertedFullPyramid(size);
}

public void FullPyramid(int size){
    for(int i=size; i>0; i--){
        for(int j=i-1; j>0; j--){
            System.out.print(" ");
        }
        for(int j=0; j<size-i+1; j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}

public void InvertedFullPyramid(int size){
    for(int i=size; i>0; i--){
        for(int j=0; j<size-i; j++){
            System.out.print(" ");
        }
        for(int j=i; j>0; j--){
            System.out.print("* ");
        }
        System.out.println();
    }
}