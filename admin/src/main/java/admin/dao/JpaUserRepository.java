package admin.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import admin.domain.org.User;

@Repository
public class JpaUserRepository implements UserRepository {

  @PersistenceContext
  private EntityManager em;

  @Override
  public long count() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public User save(User user) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public User findOne(String id) {
    return em.find(User.class, id);
  }

}
