// package com.lendingApp.main.security;

// import java.util.HashSet;
// import java.util.Set;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.GrantedAuthority;
// import org.springframework.security.core.authority.SimpleGrantedAuthority;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;

// import com.aurionpro.spring.entity.Role;
// import com.aurionpro.spring.entity.User;
// import com.aurionpro.spring.exception.UserApiException;
// import com.aurionpro.spring.repository.UserRepository;

// @Service
// public class CustomUserDetailService implements UserDetailsService{

// 	@Autowired
// 	private UserRepository userRepo;
	
// 	@Override
// 	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
// 		// TODO Auto-generated method stub
// 		User user = userRepo.findByUserName(username).
// 				orElseThrow(()->new UserApiException("User not found"));
		
// 		Role role = user.getRole();
		
// 		SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.getRoleName());
		
// 		Set<GrantedAuthority> authorities = new HashSet<>();
// 			authorities.add(authority);	
// 		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), authorities);
// 	}

// }
