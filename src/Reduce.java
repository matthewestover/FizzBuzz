public class Reduce {
    public static void main(String[] args) {
        int count = 0;
        int num = 100;
        while (num > 0){
            if (num % 2 != 0){
                num -= 1;
            }
            else {
                num /= 2;
            }
            count ++;
        }
        System.out.println(count);
    }
}
