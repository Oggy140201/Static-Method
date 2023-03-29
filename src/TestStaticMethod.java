public class TestStaticMethod {
    public static void main(String[] args) {
//        Student.change();
        Student s1 = new Student(1,"Một");
        Student s2 = new Student(2,"Hai");
        Student s3 = new Student(3,"Ba");
        s1.dislay();
        s2.dislay();
        s3.dislay();
    }
}