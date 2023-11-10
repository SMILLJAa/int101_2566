
package work01;

/*2. Create a utility class named Tool in the work01 package.
2.1. Make the class a public final class.*/
public final class Tool {
//2.2. Create a private empty constructor that does nothing. 
    private Tool(){}
    
/*2.3. Create a public static median method that receives three double parameters named d0, d1, 
    and d2, and returns a double which is the median of the three parameters. */
    public static double median(double d0 , double d1 ,double d2){
        if(d0 < d1){
         if(d1 < d2) return d1;
         if(d0 < d2) return d2;
        }
        if(d0 < d2) return d0;
        if(d1 < d2) return d2;
        return d1;
    }
    /*2.4. Create a public static compute method that receives three parameters, which are d0 (double), d1 (double), 
       and operation (String). This method returns a double which is the result of the following calculation.*/
    public static double compute(double d0, double d1, String operation){
        return 
                switch(operation){
                    case "sum","add", "plus" -> d0+d1;
                    case  "difference","subtract","minus" -> d0-d1;
                    case  "product", "multiply" , "times" -> d0*d1;
                    case "division","by" -> d0/d1;    
                    default -> throw new RuntimeException("Invalid Operation");
                };
    }
    /* 2.5. Create a public static digitProduct method that receives an int parameter named number 
and returns an int which is the product of all digits (except 0) in the number parameter. 
However, this method will return -1 if the number parameter is a negative number and return 1 if the number parameter is 0. 
For example, digitProduct(2090075) will return 630, which is the result of 2 * 9 * 7 * 5.*/
    public static int digitProduct(int number){
        if(number < 0){
            return -1;
        }
        if(number == 0 ){
            return 1;
        }
        int product = 1;
        while (number > 1){
            int mod = number % 10;
            if(mod > 1){
                product *= mod;
            }
            number /= 10;
        }
        return product;
    }
}
