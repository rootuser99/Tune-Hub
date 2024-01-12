package com.example.music.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.music.entities.Song;

public interface SongRepository extends JpaRepository<Song, Integer>
{
	public Song findByName(String name);
}
