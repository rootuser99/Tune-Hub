package com.example.music.services;

import com.example.music.entities.Users;

public interface UsersService 
{
	public String adduser(Users user);
	
	public boolean emailExists(String email);
	
	public boolean validateUser(String email,String password);
	
	public String getRole(String email);
	
	public Users getUser(String email);
	
	public void updateUser(Users user);
}
