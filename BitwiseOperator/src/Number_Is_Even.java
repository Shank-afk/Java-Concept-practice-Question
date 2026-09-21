import java.util.Scanner;
void main() {
    Scanner sc =new Scanner(System.in);
    while(true){

        System.out.println("enter the Number to Check If a Number Is Even ");
        int a = sc.nextInt();

        boolean isEven = (a & 1) == 0;
        System.out.println(isEven);

        System.out.println("enter 1 to exit");
        int choice = sc.nextInt();
        if(choice==1){
            break;
        }
    }

}