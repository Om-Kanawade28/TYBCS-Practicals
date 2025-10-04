package SY;
public class SYMarks{
    public int ComputerTotal;
    public int MathTotal;
    public int ElectronicsTotal;
    public SYMarks(int ComputerTotal, int MathTotal, int ElectronicsTotal){
        this.ComputerTotal = ComputerTotal;
        this.MathTotal = MathTotal;
        this.ElectronicsTotal = ElectronicsTotal;
    }
    public String toString(){
        return "ComputerTotal: " + ComputerTotal + " MathTotal: " + MathTotal + " ElectronicsTotal: " + ElectronicsTotal;
    }

}