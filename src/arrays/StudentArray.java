package arrays;

//first create a class
class Student {

    public int roll_no;
    public String name;

    //create constructor
    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

}

public class StudentArray {
    public static void main(String[] args) {

        //Create a Student name array
        Student[]  arr;

        //Define the size of array
        arr = new Student[5];

        //put the value on array one by one
        arr[0] = new Student(1, "Joe");
        arr[1] = new Student(2, "Hritik");
        arr[2] = new Student(3, "Leo");
        arr[3] = new Student(4, "John");
        arr[4] = new Student(5, "Trump");

        for (int i=0; i<arr.length; i++) {

            System.out.println(arr[i].name + " roll no : " + arr[i].roll_no);

        }

    }
}
