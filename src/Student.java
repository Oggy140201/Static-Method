public class Student {
    private int a;
    private String b;
    private static String college = "BBDIT";
    Student (int x,String y){
        a = x;
        b = y;
    }
//         static void change(){
//         college = "CODE GYM";
//     }
    void dislay(){
        System.out.println(a + " " + b + " " + college);
    }
}
