public class Assignment {
    public static void main(String[] args) {
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        }

        if (barking == false){
            return false;
        }

        if (hourOfDay < 8 || hourOfDay > 22 || barking == true){
            return true;
        }else {
            return false;
        }
    }
}
