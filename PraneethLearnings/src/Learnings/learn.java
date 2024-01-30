package Learnings;
import java.util.*;

public class learn{
	public static void main(String args[]){
		new re().display();
	}
}

class re
{
	void display()
	{
		System.out.println();
	}
}

class tree
{
	int length;
	int width;
	int height;
	String unit;
	tree()
	{
		this(0,0,0,"cm");
	}
	tree(int length,int width,int height)
	{
		this(length,width,height,"cm");
	}
	tree(int length,int width,int height,String unit)
	{
		this.length=length;
		this.width=width;
		this.height=height;
		this.unit=unit;
	}
	
	int volume()
	{
		return length*width*height;
	}
	
	void display()
	{
		System.out.println("Volume of the cubid:"+volume()+" cm^3");
	}
}