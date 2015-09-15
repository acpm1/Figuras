import java.util.*;
import java.lang.*;

public class FigurasPrube
{
	public static void main(String Args[])
	{
	
	Figuras [] figs = new Figuras[3];
	
	figs[0] = new Circulo(2.5, "Circulo1");
	figs[1] = new RectanguloH(2.5,5.5, "Rectangulo1");
	figs[2] = new Triangulo(2.5,5.5, "Triangulo1");

	
		for(int i = 0;i<figs.length;i++)
		{
			System.out.printf("%s , Area: %f, Perimetro: %f \n",figs[i].getName(),figs[i].getArea(),figs[i].getPerimeter());
		}
	
	}

	
}