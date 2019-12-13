public class ArrayCreation {
    public static double getAverage(double[] numbers){
        if (numbers.length < 3){
            return 0.0;
        }
        else{
            double outcome = (numbers[0] + numbers[1] + numbers[2])/3;
            return (double)((int)(outcome*100)/100);
        }

    }

    public static String stringArray(String[] friends){
        String output = "";
        if (friends.length != 5){
            return output;
        }
        else{
            output += friends[0].length() +" "+ friends[1].length() +" "+ friends[2].length() +" "+ friends[3].length() +" "+ friends[4].length();
            return output;
        }
    }

    public static void main(String [] args){
       // double [] numbers = {89, 75, 100};
       //System.out.println(getAverage(numbers));
        String[] names = {"Fred", "Barney", "Betty", "Wilma", "Pebbles"};
        System.out.println(stringArray(names));

    }


}
