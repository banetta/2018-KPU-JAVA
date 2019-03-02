public class Undergraduate extends Student {

    private String club;

    public void setClub(String club){this.club = club;}
    public String getClub(){return club;}

    public Undergraduate(String name, int student_number, String major, int year, double grade, String club){
        super(name,student_number,major,year,grade);
        setClub(club);
    }

    public String toString(){
        return "이름 : "+getName()+" 학번 : "+getStudent_number()+" 학과 : "+getMajor()+" 학년 : "+getYear()+" 이수학점 : "+getGrade()+" 동아리 : "+getClub();
    }


}
