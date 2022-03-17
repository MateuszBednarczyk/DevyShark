package com.example.blog.User;

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
  private long userId;
  private String username;
  private String password;
  private String githubLink;
  private long posts;
  private String userRole;

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
    return Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"));
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


  public long getPosts() {
    return posts;
  }

  public void setPosts(long posts) {
    this.posts = posts;
  }


  public String getUserRole() {
    return userRole;
  }

  public void setUserRole(String userRole) {
    this.userRole = userRole;
  }

}
