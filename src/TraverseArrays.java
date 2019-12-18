public class TraverseArrays {

    public static int countEven(int[] nums){
        int outcome = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2 == 0){
                outcome ++;
            }
        }
        return outcome;
    }

    public static int[] buildArray(int desiredLength){
        int[] outcome = new int[desiredLength];
        for(int i = 0; i<desiredLength; i++){
        outcome[i] = i;
        }
        return outcome;
    }

    public static boolean sum28(int[] numbers){
        int sum = 0;
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] == 2 ){
                sum +=2;
            }
        }
        if(sum == 8){
            return true;
        }
        else{
            return false;
        }
    }

    public static int[] zeroMax(int[] original){

    }

    public static void main(String []args){
        //int [] nums = {1, 3, 5};
        //System.out.println(countEven(nums));
    }
}
