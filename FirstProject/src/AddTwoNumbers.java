
public class AddTwoNumbers {

	/**
	 * @param args
	 */

    public static void main(String args[]) {
            
        System.out.println(" Using minus operator ");
        System.out.println(" Sum of 50 add 60 is : " + addusingminus(50, 60));
        
        System.out.println(" ");
        System.out.println(" Using sum/carry => XOR/AND ");
        System.out.println(" Sum of 60 add 80 is : " + addusingsumcarry(60, 80));
       
     }  
   
     /*
       Different ways to add two numbers without using + operator 
     */
    
     public static int addusingminus(int a, int b){
         int sum = a - (-b);
         return sum;
     }
  
     public static int addusingsumcarry(int a, int b){
         if(b == 0) return a;
         
         int sum = a ^ b; //SUM of two integer is a XOR b
         int carry = (a & b) << 1;  //CARRY of two integer is a AND b
         return addusingsumcarry(sum, carry);
     }
      
}
