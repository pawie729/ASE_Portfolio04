package ref;

import java.lang.reflect.Field;

/*
 * this time a reference to the b field is obtained, but when it is used, a runtime
 * exception is thrown that clearly states that members with private modifiers
 * cannot be accessed. Again data integrity stands firm.
 */

public class Reflection05 {

  public static void main(String[] args) throws Exception{
    RefMain r = new RefMain();
    
    //use .getDeclaredFields() instead of .getFields() 
    
    Field [] fields =  r.getClass().getDeclaredFields();
    System.out.printf("There are %d fields\n", fields.length);
    
    for(Field f : fields) {
      System.out.printf("field name=%s type=%s value=%d\n", 
          f.getName(), f.getType(), f.getLong(r));
      
    }
  }
}
