package day04.interfaceDemo;

public class Test {
    public static void main(String[] args) {

        Student[] allstudents= new Student[10];

        allstudents[0]=new Student("Alice",'F',20,85.5);
        allstudents[1]=new Student("Bob",'M',22,90.0);
        allstudents[2]=new Student("Charlie",'M',19,78.0);
        allstudents[3]=new Student("Diana",'F',21,92.5);
        allstudents[4]=new Student("Ethan",'M',23,88.0);
        allstudents[5]=new Student("Fiona",'F',20,95.0);
        allstudents[6]=new Student("George",'M',22,80.5);
        allstudents[7]=new Student("Hannah",'F',19,87.0);
        allstudents[8]=new Student("Ian",'M',21,91.0);
        allstudents[9]=new Student("Jane",'F',20,89.5);


        ClassDataInter cdi = new ClassDataInterImpl2(allstudents);
        cdi.printAllStudents();
        cdi.printAvgScore();


    }
}
