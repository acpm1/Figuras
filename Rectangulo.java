import java.util.*;
import java.lang.*;

public class Rectangulo
{
	
		private double width ;
		private double hight ;
		
		public Rectangulo()
		{
		this(1,1);
		}
		
		public Rectangulo(double width, double hight)
		{
			try
			{
			comprobar(width);
			this.width = width;
			}
			catch(IndexOutOfBoundsException e)
			{
			// System.out.printf("ancho %s\n",e.getMessage());
			this.width = 1;
			}
			
			try
			{
			comprobar(hight);
			this.hight = hight;
			}
			catch(IndexOutOfBoundsException e)
			{
			// System.out.printf("ancho %s\n",e.getMessage());
			this.hight = 1;
			}
					
		}
		

		public void comprobar(double value) throws  IndexOutOfBoundsException
		{
			if(value < 1 || value > 20)
			throw new IndexOutOfBoundsException("es menor que 1 o mayor que 20, se fija a 1 por defecto");
		}
		
		public void setHight(double hight)
		{
			try
			{
			comprobar(hight);
			this.hight = hight;
			}
			catch(IndexOutOfBoundsException e)
			{
			// System.out.printf("ancho %s\n",e.getMessage());
			this.hight = 1;
			}
			
		}
		
		public void setWidth(double width)
		{
			try
			{
			comprobar(width);
			this.width = width;
			}
			catch(IndexOutOfBoundsException e)
			{
			// System.out.printf("ancho %s\n",e.getMessage());
			this.width = 1;
			}
			
		}

		public double getHight()
		{
		return hight;	
		}
		
		public double getWidth()
		{
		return width;	
		}
		
		public double getPerimeter()
		{
			return (2*width+2*hight);
		}
		
		public double getArea()
		{
			return width*hight;
		}
	
}