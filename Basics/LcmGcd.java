
import java.util.*;
public class LcmGcd {
    public static void main(String[] args) {
        int n1,n2;
        System.out.println("Ënter the first number: " );
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        System.out.println("Ënter the first number: " );
   
        n2 = sc.nextInt();

        int lcm = (n1>n2)?n1:n2;

        while(true){
            if(lcm %n1==0 && lcm %n2==0 ){
                
                System.out.println("Lcm of enterned number :" +lcm);
                break;
            }
            ++lcm;
        }  

        //hcf/gcd
        //comman factors
        int g = 0;
        for(int i =1;i<=0;i++){
            if(n1%i==0 && n2%i==0){
                g=i;//final value of g is 10 or the highest  comman factor 
            }
            

        }
        System.out.println("GCD = " + g);

    }
}

// 50 and 60 
//50 = 1 , 2 ,5 ,10
//g= 0 
//g =1
//g =2 
//g = 10
