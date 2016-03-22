package admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import admin.dao.UserRepository;
import admin.domain.org.User;

@Component
public class LoginService {
  
  @Autowired
  UserRepository userRepository;
  
  public LoginResult login(String userId, String password){
    User user = userRepository.findOne(userId);
    LoginResult result = new LoginResult();
    
    if(user == null){
      result.setMessage("该用户不存在");
    }else if(!checkPassword(user, password)){
      result.setMessage("密码错误");
    }else{
      result.setSuccess(true);
      result.setUser(user);
      result.setMessage("登陆成功");
    }
    
    return result;
  }

  private boolean checkPassword(User user, String password) {
    if(user == null || password == null){
      return false;
    }
    return password.equals(user.getPassword());
  }
  
}
