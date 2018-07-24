package Group_Serialization;

import java.io.Serializable;

public class Faculty implements Serializable {
    private Group[] faculty;
    private static final long serialVersionUID = 1L;

    public Faculty(){
        faculty = new Group[0];
    }
    public void addGroup(String name, int quantity, char marks){
        Group[] f = new Group[faculty.length+1];
        System.arraycopy(faculty,0,f,0,faculty.length);
        f[f.length-1]=new Group(name, quantity, marks);
        faculty = f;
    }

    public void printFaculty(){
        for (Group g: faculty
             ) {
            System.out.println(g);
        }
    }
}
