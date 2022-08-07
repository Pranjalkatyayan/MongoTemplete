package Tree_Practise;

public class StudentClass {

    int rollno;
    int classId;
    String name;

    int compareTo(StudentClass st){
        if(rollno== st.rollno){
            return 0;
        }
        else if(rollno> st.rollno){
            return 1;
        }
        else{
            return -1;
        }
    }
}
