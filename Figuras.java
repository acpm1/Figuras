import java.util.*;
import java.lang.*;

abstract class Figuras
{
		protected double hight;
		protected double width;
		protected double radius;
		protected String name;
				
		abstract double getArea();
		abstract double getPerimeter();
		abstract String getName();
	
}