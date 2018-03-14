@FunctionalInterface
interface Drawable {  
    default public void draw(){ System.out.println("Drawing ");  }
    public void draw2(String name);  
}  

public class LambdaExpression {

	public static void main(String[] args) {
		int width=10;  
        
		//with lambda  
        Drawable d2=(name1)->{  
            System.out.println("Drawing "+name1);  
        };  
        d2.draw2("vikas");  
	}

}
