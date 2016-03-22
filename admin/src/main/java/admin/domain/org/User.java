package admin.domain.org;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import admin.domain.sys.Role;

@Entity
public class User {

  @Id
  private String id;

  private String password;
  private String name;
  boolean available;
  
  @ManyToMany
  private Set<Position> positions;
  
  @ManyToMany
  private Set<Role> roles;

  public Set<Position> getPositions() {
    return positions;
  }

  public void setPositions(Set<Position> positions) {
    this.positions = positions;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isAvailable() {
    return available;
  }

  public void setAvailable(boolean available) {
    this.available = available;
  }
}
