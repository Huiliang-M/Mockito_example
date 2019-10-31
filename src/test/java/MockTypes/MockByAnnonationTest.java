package MockTypes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import qucikstart.AccoundDao;
import qucikstart.Account;

public class MockByAnnonationTest {

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
//	
//	@Mock
//	private AccoundDao accounddao;
	
	@Mock(answer = Answers.RETURNS_SMART_NULLS)
	private AccoundDao accounddao;
	
	
	@Test
	public void testMock() {
		
		Account account = accounddao.findAccount("x","x");
		System.out.println(account);
	}
	
	
}
