import java.util.ArrayList;  
import java.util.Collections;  
import java.util.List;  

public class LambdaExpressionExample10{  
    public static void main(String[] args) {  
        List<String> list=new ArrayList<String>();  
          
        //Adding Products  
        list.add("HP Laptop");  
        list.add("Keyboard");  
        list.add("Dell Mouse");  
          
        System.out.println("Sorting on the basis of name...");  
  
        // implementing lambda expression  
        Collections.sort(list,(p1,p2)->{  
        return p1.compareTo(p2);  
        });  
        for(String p:list){  
            System.out.println(p);  
        }  
  
    }  
}  
