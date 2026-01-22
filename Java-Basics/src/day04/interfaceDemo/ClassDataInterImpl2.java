package day04.interfaceDemo;

public class ClassDataInterImpl2 implements ClassDataInter {

    private Student[] students;
    public ClassDataInterImpl2(Student[] students){
        this.students=students;

    }

    @Override
    public void printAllStudents() {
        int maleCount = 0;
        int femaleCount = 0;
        for (Student student : students) {
            if(student.getGender()=='M'){
                maleCount++;
            }else if(student.getGender()=='F'){
                femaleCount++;
            }
            System.out.println("学生姓名为："+student.getName()+" 学生性别为："+student.getGender()+" 学生年龄为："+student.getAge()+
                    " 学生分数为："+student.getScore());
        }

        System.out.println("班级男生人数为："+maleCount+" 班级女生人数为："+femaleCount);
    }

    @Override
    public void printAvgScore() {
        double score=0;
        double max=-1;
        double min=101;
        for (Student student : students) {
            score += student.getScore();
            if (student.getScore() > max) {
                max = student.getScore();
            }
            if (student.getScore() < min) {
                min = student.getScore();
            }
        }
        System.out.println("班级平均分为："+(score/students.length)+" 班级最高分为："+max+" 班级最低分为："+min);
    }
}
