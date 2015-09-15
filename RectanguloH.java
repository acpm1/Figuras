import java.util.*;
import java.lang.*;

public class RectanguloH extends Figuras
{
		private String name;
		
		public RectanguloH(double hight,double width, String name)
		{
			this.hight = hight;
			this.width = width;
			this.name = name;
		}
		
		public double getArea()
		{
			return hight*width;
		}
		
		public double getPerimeter()
		{
			return 2*(hight*width);
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