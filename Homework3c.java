public class Homework3c
{
    public static void main(String args[]) {
        String[] myArray = new String[]{"G", "l", "o", "b", "o", "f", "o", "r", "c", "e"};
        String str2 = "";
        for (int i = 0; i < myArray.length; i++) {
            str2 = str2 + myArray[i];
        }
        System.out.println(str2);
        System.out.println("This Array size is:"+myArray.length);
    }
}