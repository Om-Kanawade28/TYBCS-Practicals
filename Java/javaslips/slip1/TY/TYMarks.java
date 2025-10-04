package TY;
public class TYMarks{
    public int Theory;
    public int Practicals;
    public TYMarks(int Theory, int Practicals){
        this.Theory = Theory;
        this.Practicals = Practicals;
    }
    public String toString(){
        return "Theory: " + Theory + " Practicals: " + Practicals;
    }
}