import java.util.*;
import java.lang.*;

public class Triangulo extends Figuras
{
		private String name;
		
		public Triangulo(double hight,double width, String name)
		{
			this.hight = hight;
			this.width = width;
			this.name = name;
		}
		
		public double getArea()
		{
			return 0.5*hight*width;
		}
		
		public double getPerimeter()
		{
			return Math.sqrt(Math.pow(width/2,2)+Math.pow(hight,2))*2+width;
		}
		
		public void setHight(double hight)
		{
			this.hight = hight;
		}		
		
		public double getHighth()
		{
			return hight;
		}
		
		public void setWidth(double width)
		{
			this.width = width;
		}		
		
		public double getWidth()
		{
			return width;
		}
		
		public String getName()
		{
			return name;
		}
	
}