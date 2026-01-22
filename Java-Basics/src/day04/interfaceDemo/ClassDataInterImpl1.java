package day04.interfaceDemo;

public class ClassDataInterImpl1 implements ClassDataInter {

    private Student[] students;
    public  ClassDataInterImpl1(Student[] students){
        this.students=students;

    }

    @Override
    public void printAllStudents() {
        for (Student student : students) {
            System.out.println("学生姓名为："+student.getName()+" 学生性别为："+student.getGender()+" 学生年龄为："+student.getAge()+
            " 学生分数为："+student.getScore());
        }
    }

    @Override
    public void printAvgScore() {
        double score = 0;
        for (Student student : students) {
            score += student.getScore();
        }
        double avgScore = score / students.length;
        System.out.println("班级平均分为："+avgScore);
    }
}
