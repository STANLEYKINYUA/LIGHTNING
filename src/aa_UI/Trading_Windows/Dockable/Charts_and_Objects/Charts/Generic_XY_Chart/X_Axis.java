package aa_UI.Trading_Windows.Dockable.Charts_and_Objects.Charts.Generic_XY_Chart;

import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class X_Axis extends Line2D
{
    @Override
    public double getX1() {
        return 0;
    }

    @Override
    public double getY1() {
        return 0;
    }

    @Override
    public Point2D getP1() {
        return null;
    }

    @Override
    public double getX2() {
        return 0;
    }

    @Override
    public double getY2() {
        return 0;
    }

    @Override
    public Point2D getP2() {
        return null;
    }

    @Override
    public void setLine(double x1, double y1, double x2, double y2) {

    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }
    /**Create the Constructor that allows for Graphics to be drawn */

    public X_Axis(int X_Start,int X_End, int Y_Start , int Y_end)
    {


    }



}
