void main() {
    Scanner sc =new Scanner(System.in);
    while(true) {

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.print("Enter index to Clear the K-th Bit :  ");
        int k = sc.nextInt();

        int BitCleaner = 1 << k;
        int ans = n & ~BitCleaner;

        System.out.println(ans);

        System.out.print("enter 1 to exit : ");
        int choice = sc.nextInt();
        if(choice==1){
            break;
        }
    }
}