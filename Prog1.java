public class Prog1{
    public static void main (String args []){
        for (int i = 1; i <= 100; i++) {
             if (i % 5 == 0){
                System.out.println("fizz ");
             }
                
            else if (i % 7 == 0){
                 System.out.println("buzz ");
            }
               
                else if (i % 5 == 0 && i % 7 == 0){
                     System.out.print("fizzbuzz ");
                } else{
                    System.out.print(i + " ");
                } 
                
        }
        System.out.println();
    }
    }
