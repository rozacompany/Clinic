package com.rozacompany.clinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rozacompany.clinic.entity.User;
import com.rozacompany.clinic.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserRepository userRepository;
	
	
//	public List<User> findAll() {
//		//return userDao.findAll();
//		return userRepository.findAll();
//	}
//
//	public User create(User user) {
//		//return userDao.create(user);
//		return userRepository.save(user);
//	}
//
//	public User findUserById(int id) {
//		//return userDao.findUserById(id);
//		return userRepository.findOne(id);
//	}
//
//	public User login(String email, String password) {
//		//return userDao.login(email,password);
//		//return userRepository.login(email,password);
//		return userRepository.findByEmailAndPassword(email,password);
//	}
//
//	public User update(User user) {
//		return userRepository.save(user);
//	}
//
//	public void deleteUser(int id) {
//		userRepository.delete(id);
//	}
//
	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		User user = findByUsername(username);
		if(user == null){
			throw new UsernameNotFoundException(String.format("Username %s can not be found", username));
		}
		return user;
	}
	
}
