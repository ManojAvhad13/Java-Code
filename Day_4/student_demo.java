package Day_4;

public class student_demo {
    public static void main(String[] args) {
        student studObjOne = new student();
        System.out.println("Roll Number " + studObjOne.getRollNo());
        System.out.println("Name " + studObjOne.getName());
        System.out.println("Branch " + studObjOne.getBranch());

        studObjOne.setRollNo(1);
        studObjOne.setName("Manoj");
        studObjOne.setBranch("Comp");

        System.out.println("-----------------------------------");
        System.out.println("Roll Number " + studObjOne.getRollNo());
        System.out.println("Name " + studObjOne.getName());
        System.out.println("Branch " + studObjOne.getBranch());

        student studObjTwo = new student(2, "Gaurav", "IT");
        System.out.println("-----------------------------------");
        System.out.println("Roll Number " + studObjTwo.getRollNo());
        System.out.println("Name " + studObjTwo.getName());
        System.out.println("Branch " + studObjTwo.getBranch());

        student stud;
        stud = studObjOne.getStudent();
        System.out.println("-----------------------------------");
        System.out.println("Roll Number " + stud.getRollNo());
        System.out.println("Name " + stud.getName());
        System.out.println("Branch " + stud.getBranch());

    }
}
