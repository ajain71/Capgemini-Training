public class pen {
    public static void main(String[] args) {
        int pen = 14;
        int stud = 3;
        int remain = pen % stud;
        int pend = (pen - remain)/stud;
        System.out.println("The Pen Per Student is " + pend + " and the remaining pen not distributed is " + remain);
    }
}

