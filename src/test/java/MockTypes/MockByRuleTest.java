package MockTypes;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import static org.mockito.Mockito.mock;

import qucikstart.AccoundDao;
import qucikstart.Account;

public class MockByRuleTest {

	
	@Rule
	public MockitoRule mockitoRule =  MockitoJUnit.rule();
	
	@Mock
	private AccoundDao dao;
	
	@Test
	public void TestMock()
	{
		
		//AccoundDao accoundao = mock(AccoundDao.class);
		Account account = dao.findAccount("x", "x");
		System.out.println(account);
	}
	
	
}
