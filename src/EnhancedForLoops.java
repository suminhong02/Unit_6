public class EnhancedForLoops {

    public static String printStandardFor(String[] arr){
        String outcome = "";
        for(int i = 0; i<arr.length; i++){
            outcome += arr[i]+" ";
        }
        return outcome;
    }

    public static String printStandardFor(int[] arr){
        String outcome = "";
        for(int i = 0; i<arr.length; i++){
            outcome += arr[i]+" ";
        }
        return outcome;
    }

    public static String printStandardFor(double[] arr){
        String outcome = "";
        for(int i = 0; i<arr.length; i++){
            outcome += arr[i]+" ";
        }
        return outcome;
    }

    public static String printEnhancedFor(String [] arr){
        String outcome = "";
        for(String x:arr){
            outcome += x+" ";
        }
        return outcome;
    }

    public static String printEnhancedFor(int[] arr){
        String outcome = "";
        for(int x:arr){
            outcome += x+" ";
        }
        return outcome;
    }

    public static String printEnhancedFor(double[] arr){
        String outcome = "";
        for(double x:arr){
            outcome += x+" ";
        }
        return outcome;
    }

    public static String printStandardWhile(String[] arr){
        String outcome = "";
        int i = 0;
        while(i<arr.length){

            outcome += arr[i] +" ";
            i++;
        }
        return outcome;
    }

    public static String printStandardWhile(int[] arr){
        String outcome = "";
        int i = 0;
        while(i<arr.length){
            outcome += arr[i] +" ";
            i++;


        }
        return outcome;
    }

    public static String printStandardWhile(double[] arr){
        String outcome = "";
        int i = 0;
        while(i<arr.length){
            outcome += arr[i] +" ";
            i++;

        }
        return outcome;
    }



    public static void main(String []args){
    }
}
