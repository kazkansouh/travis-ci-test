import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CheckMath {
    @Test
    public void CheckAdd() {
	assertEquals(Math.add(1,3),4);
	assertEquals(Math.add(0,0),0);
	assertEquals(Math.add(2,0),2);
	assertEquals(Math.add(0,2),2);
    }

    @Test
    public void CheckSub() {
	assertEquals(Math.sub(1,3),-2);
	assertEquals(Math.sub(0,0),0);
	assertEquals(Math.sub(2,0),2);
	assertEquals(Math.sub(0,2),-2);
    }

    @Test
    public void CheckMult() {
	assertEquals(Math.mult(1,3),3);
	assertEquals(Math.mult(3,3),9);
	assertEquals(Math.mult(2,0),0);
	assertEquals(Math.mult(0,2),0);
    }
}
