package admin.domain.org;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Position {

  @Id
  private String id;
  private String name;
  private String description;

  @ManyToOne
  private Position parentPosition;

  @ManyToMany(mappedBy="positions")
  private Set<User> users;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Position getParentPosition() {
    return parentPosition;
  }

  public void setParentPosition(Position parentPosition) {
    this.parentPosition = parentPosition;
  }

  public Set<User> getUsers() {
    return users;
  }

  public void setUsers(Set<User> users) {
    this.users = users;
  }
}
