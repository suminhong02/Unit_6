public class ArrayAlgorithms {

    public static String printArray(int[] nums){
        String outcome = "";
        for(int x:nums){
            outcome += x+" ";
        }
        return outcome;
    }

    public static boolean checkForAllNegatives(int[] list){
        int outcome = 0;
        for(int x:list){
            if(x<0){
                outcome++;
            }

        }
        if(outcome == list.length){
            return true;
        }
        return false;
    }

    public static boolean hasDupes(int[] list){
        for(int x=0;x<list.length;x++){
            for(int k=x+1;k<list.length;k++){
                if(list[x]==list[k])
                    return true;
            }
        }
        return false;
    }

    public static int countEvens(int[] list){
        int outcome = 0;
        for(int x:list){
            if(x%2==0){
                outcome++;
            }
        }
        return outcome;
    }

    public static int[] leftShift(int[] nums, int shift){
         int [] outcome= new int[shift+nums.length];
        int temp = outcome[0];
        for(int x=0;x<nums.length; x++){
            outcome[x] = nums[x];
        }
        return outcome;
    }

    public static String reverseArray(int [] list){
        int [] outcome = new int[list.length];
        int []temp = outcome;
        for(int i = 0; i<list.length; i++) {
            outcome[i] = list[list.length -1 - i];
        }
        return printArray(outcome);
    }

    
}
