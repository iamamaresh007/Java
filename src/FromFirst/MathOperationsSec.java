package FromFirst;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathOperationsSpec {

	@Test
		void BiggestOfThree()
		{
			MathOperations obj = new MathOperations();
			int res=obj.Biggest(100,45,1007);
			assertEquals(1007,res);
		}
	
	

}
