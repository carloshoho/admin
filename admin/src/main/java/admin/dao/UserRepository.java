package admin.dao;

import org.springframework.stereotype.Repository;

import admin.domain.org.User;

@Repository
public interface UserRepository {
  
  long count();

  User save(User user);

  User findOne(String id);

}