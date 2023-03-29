import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CatTest {
     Cat newCat;
    @Before
    public void setUp(){
        newCat= new Cat("Murka", 3);
    }
    @Test
    public  void shouldGetAge(){
        newCat.getAge();
        Assert.assertEquals(3, newCat.getAge());
    }
    @Test
    public void shouldMeow(){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        newCat.meow();
        Assert.assertEquals(output.toString(), "Meow!\r\n");
    }
    @Test
    public void shouldSetName (){
        newCat.name="Vaska";
        Assert.assertEquals(newCat.name, "Vaska");
    }
    @Test
    public void shouldGetName (){
        Assert.assertEquals(newCat.name, "Murka");
    }
    @After
    public void remove(){
        newCat=null;
    }

}
