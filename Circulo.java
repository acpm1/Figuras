import java.util.*;
import java.lang.*;

public class Circulo extends Figuras
{		
		private String name;
		
		public Circulo(double radius , String name)
		{
			this.radius = radius;
			this.name = name;
		}
		
		public double getArea()
		{
			return Math.PI*radius*radius;
		}
		
		public double getPerimeter()
		{
			return 2*Math.PI*radius;
		}
		
		public void setRadius(double radius)
		{
			this.radius = radius;
		}		
		
		public double getRadius()
		{
			return radius;
		}
		
		public String getName()
		{
			return name;
		}
	
}