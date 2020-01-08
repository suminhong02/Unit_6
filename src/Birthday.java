public class Birthday {

    public static int[] dates(int num){
        int[] birthday = new int[num];
        for(int i = 0; i<num; i++){
            int date = (int)(Math.random()*365);
            birthday[i] = date;
        }
        return birthday;
    }
    public static boolean hasDupes(int[] birthdays){
        for(int x = 0; x < birthdays.length; x++){
            for(int k = x + 1; k < birthdays.length; k++){
                if(birthdays[x] == birthdays[k])
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        double total = 0;
        for(int i = 0; i < 1000; i++){
            if(hasDupes(dates(23))){
                total++;
            }
        }
        double outcome = total/1000*100;
        System.out.println("The percent of times there were duplicate birthdays is " + outcome + "%.");
    }
}
