package qucikstart;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyString;
import javax.servlet.http.HttpServletRequest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Equals;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ControllerUnitTest {

	private AccoundDao account;
	private HttpServletRequest request;
	private AccountLoginController controller;
	
	@Before
	public void setUp() {
		this.account = Mockito.mock(AccoundDao.class);
		this.request = Mockito.mock(HttpServletRequest.class);
		this.controller = new AccountLoginController(account);
	}
	
	@Test
	public void testsuccess() {
		
		Account a = new Account();
		Mockito.when(request.getParameter("username")).thenReturn("John");
		Mockito.when(request.getParameter("pwd")).thenReturn("123");		
		Mockito.when(account.findAccount("John","123")).thenReturn(a);
		
		assertEquals("/index", controller.login(request));

	}
	
	@Test
	public void testUnsuccess() {
		
		Mockito.when(request.getParameter("username")).thenReturn("John");
		Mockito.when(request.getParameter("pwd")).thenReturn("1213");		
		Mockito.when(account.findAccount(anyString(),anyString())).thenReturn(null);
		
		assertEquals("/login", controller.login(request));

	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void test505() {
		
		Mockito.when(request.getParameter("username")).thenReturn("John");
		Mockito.when(request.getParameter("pwd")).thenReturn("123");		
		Mockito.when(account.findAccount("John","123")).thenThrow(UnsupportedOperationException.class);
		
		assertEquals("/505", controller.login(request));
		
	}
	
}
