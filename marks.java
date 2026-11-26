public class marks {
    public static void main(String[] args) {
        int mark = 1;
        if (mark >= 91 && mark <= 100) {
            System.out.println("grade A");
        } else if (mark >= 81 && mark <= 90) {
            System.out.println("grade B");
        } else if (mark >= 71 && mark <= 80) {
            System.out.println("grade C");
        } else if (mark >= 35 && mark <= 60) {
            System.out.println("grade D");
        } else {
            System.out.println("fail");
        }
    }
}