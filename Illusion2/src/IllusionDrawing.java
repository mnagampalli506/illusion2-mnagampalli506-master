import java.awt.Color;
import mnagampalli506.shapes.Line;
import mnagampalli506.shapes.Rectangle;

/**
 * 
 * The IllusionDrawing is a ShapeDrawing consisting of shapes to display one of
 * the 4 optical illusions.
 * 
 * @author Mana Nagampalli
 * @version 01
 *
 */
public class IllusionDrawing extends ShapeDrawing {

	/**
	 * Constructs an IllusionDrawing by generating the appropriate shapes.
	 */
	public IllusionDrawing() {
		super();

		Line l = new Line(0, 100, 350, 0);
		Line l2 = new Line(0, 110, 400, 30);
		Line l3 = new Line(0, 120, 400, 60);
		Line l4 = new Line(0, 130, 400, 90);
		Line l5 = new Line(0, 140, 400, 120);
		Line l6 = new Line(0, 150, 400, 150);
		Line l7 = new Line(0, 160, 400, 180);
		Line l8 = new Line(0, 170, 400, 210);
		Line l9 = new Line(0, 180, 400, 240);
		Line l10 = new Line(0, 190, 400, 270);
		Line l11 = new Line(0, 200, 350, 300);
		
		Rectangle r1 = new Rectangle(180, 125, 5, 70);
		r1.setFillColor(Color.BLUE);
		Rectangle r2 = new Rectangle(220, 125, 5, 70);
		r2.setFillColor(Color.BLUE);
		
		super.addShape(r1);
		super.addShape(r2);
		super.addShape(l);
		super.addShape(l2);
		super.addShape(l3);
		super.addShape(l4);
		super.addShape(l5);
		super.addShape(l6);
		super.addShape(l7);
		super.addShape(l8);
		super.addShape(l9);
		super.addShape(l10);
		super.addShape(l11);

	}

}
