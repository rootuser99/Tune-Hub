package com.example.music.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.music.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>
{
	public Users findByEmail(String email);
}
