public class Student {

    private String name;
    private int student_number;
    private String major;
    private int year;
    private double grade;

    public void setName(String name){this.name = name;};
    public void setStudent_number(int number){this.student_number = number;};
    public void setMajor(String major){this.major = major;};
    public void setYear(int year){this.year = year;};
    public void setGrade(double grade){this.grade = grade;};

    public String getName(){return name;}
    public int getStudent_number(){return student_number;}
    public String getMajor(){return major;}
    public int getYear(){return year;}
    public double getGrade(){return grade;}

    public Student(){
        setName("null");
        setStudent_number(0);
        setMajor("null");
        setYear(0);
        setGrade(0);
    }

    public Student(String name, int student_number, String major, int year, double grade){
        setName(name);
        setStudent_number(student_number);
        setMajor(major);
        setYear(year);
        setGrade(grade);
    }
}
