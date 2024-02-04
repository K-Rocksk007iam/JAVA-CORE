package pen;

public class TestPen {

	public static void main(String[] args) {
		Pen pen = new Pen("Black", "10CM", 10, "Montex");
		System.out.println("-----------------------------\n");
		System.out.println(pen);
		pen.writing();
		pen.marking();
		pen.highlighting();
		System.out.println("-----------------------------\n");
		BallPointPen ballPen= new BallPointPen("Black", "8CM", 20, "Montex", 1,"solid");
		System.out.println(ballPen);
		pen.writing();
		pen.marking();
		System.out.println("-----------------------------\n");
		GelPointPen gelPen = new GelPointPen("black", "10CM", 30, "Montex", "plastic","Needed");
		System.out.println(gelPen);
		pen.writing();
		pen.highlighting();
	}

}
