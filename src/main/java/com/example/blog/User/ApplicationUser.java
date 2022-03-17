package com.example.blog.User;

import com.sun.istack.NotNull;
import org.hibernate.mapping.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;

@Entity
@Table(name = "users")
public class ApplicationUser implements UserDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "UserID")
  private long userId;

  @Column(name = "Username")
  private String username;

  @Column(name = "Password")
  private String password;

  @Column(name = "GithubLink")
  @NotNull
  private String githubLink;

  @Column(name = "Posts")
  private List postsList;

  public ApplicationUser(String username, String password, String githubLink) {
    this.username = username;
    this.password = password;
    this.githubLink = githubLink;
  }

  public ApplicationUser() {
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUsername() {
    return username;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return Collections.singleton(new SimpleGrantedAuthority("USER_ROLE"));
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getGithubLink() {
    return githubLink;
  }

  public void setGithubLink(String githubLink) {
    this.githubLink = githubLink;
  }

  public List getPostsList() {
    return postsList;
  }

  public void setPostsList(List postsList) {
    this.postsList = postsList;
  }
}
