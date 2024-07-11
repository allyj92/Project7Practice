package array;

public class Quiz8 {
    public static void main(String[] args) {
        Student[] student = new Student[3];

        student[0] = new Student(1,"AAA");
        student[1] = new Student(2,"BBB");
        student[2] = new Student(3,"CCC");

        for(int i = 0; i<student.length;i++){
            System.out.println(student[i].showInfo());
        }

    }
}

class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

  public String showInfo(){
    return "학생 번호 : " + id + " " + "학생 이름 : " + name;
  }
}
