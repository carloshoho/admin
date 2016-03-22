package admin.domain.sys;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Menu {

  @Id
  private String id;
  private String name;
  private String url;
  
  @ManyToOne
  private Menu parentMenu;
  
  @OneToMany(mappedBy = "parentMenu")
  private Set<Menu> subMenus;
  
  @ManyToOne
  private Privilege privilege;

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

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Menu getParentMenu() {
    return parentMenu;
  }

  public void setParentMenu(Menu parentMenu) {
    this.parentMenu = parentMenu;
  }

  public Set<Menu> getSubMenus() {
    return subMenus;
  }

  public void setSubMenus(Set<Menu> subMenus) {
    this.subMenus = subMenus;
  }

  public Privilege getPrivilege() {
    return privilege;
  }

  public void setPrivilege(Privilege privilege) {
    this.privilege = privilege;
  }
}
