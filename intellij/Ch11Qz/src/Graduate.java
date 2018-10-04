public class Graduate extends Student{

    private boolean assistant;
    private boolean scholarship;



    public String getAssistant(){
        if (assistant == true)
            return "교육조교";
        else
            return "연구조교";
    }

    public String getScholarship(){
        if (scholarship == true)
            return "받음";
        else
            return "못받음";
    }

    public void setAssistant(boolean assistant){this.assistant = assistant;}
    public void setScholarship(boolean scholarship){this.scholarship = scholarship;}

    public Graduate(String name, int student_number, String major, int year, double grade, boolean assistant, boolean scholarship){
        super(name, student_number, major, year, grade);
        setAssistant(assistant);
        setScholarship(scholarship);
    }

    public String toString(){
        return "이름 : "+getName()+" 학번 : "+getStudent_number()+" 학과 : "+getMajor()+" 학년 : "+getYear()+" 이수학점 : "+getGrade()+" 유형 : "+getAssistant()+" 장학유형 : "+getScholarship();
    }
}
