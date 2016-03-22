package admin.service;

import admin.domain.org.User;

public class LoginResult {
  
  private boolean success;
  private User user;
  private String message;

  public User getUser() {
    return user;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public boolean isSuccess() {
    return success;
  }

  public void setSuccess(boolean success) {
    this.success = success;
  }
}
