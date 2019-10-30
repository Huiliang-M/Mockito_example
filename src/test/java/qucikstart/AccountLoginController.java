package qucikstart;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServlet;

public class AccountLoginController {

	private final AccoundDao accountdao;
	public AccountLoginController(AccoundDao accountdao) {
		this.accountdao = accountdao;
	}



	public String login(HttpServletRequest request) {
		
		final String username = request.getParameter("username");
		final String pwd = request.getParameter("pwd");
		
		Account account = accountdao.findAccount(username, pwd);
		try {
			if(account == null) {
				return "/login";
				
			}else {
				
				return "/index";
			}
		} catch (Exception e) {
			return "/505";
		}
		
		
	}
	
	
}
