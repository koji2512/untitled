package javahukusyuu.javahukusyuu2;

public class java26 {
    public static void main(String[] args) {
        int[] numArray = new int[]{10,11,12,13,14,15};
        int target = 13;
        int count = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == target) {
                count++;
            }
        }
        System.out.println("結果"+target);
        System.out.println("結果"+count);
    }
}
