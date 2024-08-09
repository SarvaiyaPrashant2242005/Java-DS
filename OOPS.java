public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.SetColor("Red");
        p1.SetTip(10);
        p1.SetColor("Yellow");
        System.out.println("Pen Color : " + p1.Color);
        System.out.println("Pen Tip size: "  +p1.tip);
    }
}
class Pen{
    String Color;
    int tip;
    
    void SetColor(String newColor){
        Color = newColor;
    }
    void SetTip(int newTip){
        tip = newTip;
    }

}