public class MaxElementOfArray {

    public static void main(String[] args) {
           double[] my_array = {2,3,5,-5,6,7,-88,0,999};
           int lengthOfArray = my_array.length;

           if(my_array != null && lengthOfArray != 0) {
               if(lengthOfArray == 1) {
                      System.out.println(my_array[0]);
               }

               System.out.println(getMaxValueByRecursion(my_array,lengthOfArray));
               System.out.println(getMaxValueByIteration(my_array));
           }

    }

    public static double getMaxValueByRecursion(double[] my_array , int length) {

        if(length == 0) {
            return my_array[0];
        }

        return my_array[length-1] > getMaxValueByRecursion(my_array,length-1) ? my_array[length-1] : getMaxValueByRecursion(my_array,length-1);

        /*if(my_array[length-1] > getMaxValueByRecursion(my_array,length-1)) {
            return my_array[length-1];
        } else {
            return getMaxValueByRecursion(my_array,length-1);
        }*/

        //return Math.max(my_array[length-1],getMaxValueByRecursion(my_array,length-1));

    }

    public static double getMaxValueByIteration(double[] my_array) {

        double max = my_array[0];
        for(int i=1; i<my_array.length; i++)
        {
            if(my_array[i]>max)
                max = my_array[i];
        }
        return max;


    }
}
