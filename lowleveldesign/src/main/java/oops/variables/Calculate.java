package oops.variables;

public class Calculate {
    static  int carPrice= 40;
    //create a method static if it only works on arguments
    static int Sum(int a, int b){
        int total = a+b;
        return total;
    }
    public int sum(int a, int b){
        int total = a+b;
        carPrice= carPrice+total;
        return carPrice;
    }
    public static int sum(int ...variable){
        int output = 0;

            for(int var: variable){
                output = output +var;
            }

            return output;
        }
        public static  void main(String[] args){
        Calculate calcObj = new Calculate();
        calcObj.sum(1,2,3,4,7);
        calcObj.sum(1,8,9,10);
        }
    }


