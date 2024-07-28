package Primary;
import java.util.Scanner;

class prime_no
{
    public static void main(String[] args) {
        int no,cnt=0;

        Scanner sn=new Scanner(System.in);

        System.out.println("Enter Number :");
        no=sn.nextInt();

        for(int i=1; i<=no; i++)
        {
            if(no%i==0)
            {
                cnt++;
            }
        }

        if(cnt==2)
        {
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
}