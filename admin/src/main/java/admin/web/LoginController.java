package admin.web;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import admin.domain.org.User;
import admin.service.LoginResult;
import admin.service.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {
  
  @Autowired
  LoginService loginService;

  @RequestMapping(method = RequestMethod.GET)
  public String showLoginPage() {
    return "login";
  }
  
  @RequestMapping(method = RequestMethod.POST)
  @ResponseBody
  public LoginResult login(String userId, String password, HttpSession session) {
    LoginResult result = loginService.login(userId, password);
    if(result.isSuccess()){
      User user = result.getUser();
      user.getPositions();
      user.getRoles();
      session.setAttribute("user", user);
    }
    return result;
  }

}
