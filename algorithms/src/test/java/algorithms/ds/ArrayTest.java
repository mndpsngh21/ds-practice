package algorithms.ds;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.mandeep.ds.array.Array;

public class ArrayTest {


Array<Integer> testArray=null;	
int size=10;	

@Before
public void init()
{
	testArray = new Array<Integer>(size);
}

@Test
public void verifySize() {
	assertEquals(size, testArray.size());
}


@Test
public void addElementTest()
{
	testArray.addElement(13, 3);
	assertEquals(13, (int)testArray.getElement(3));
}


@Test(expected = RuntimeException.class)
public void overFlowTest()
{
	  testArray.addElement(12, size+1);
}


@Test
public void deleteTest() {
	testArray.remove(4);
	assertNull(testArray.getElement(4));
}


@Test
public void clearArrayTest()
{
	testArray.clear();
	assertNull(testArray.getElement(1));
	assertNull(testArray.getElement(3));
	
}


	
	
}
