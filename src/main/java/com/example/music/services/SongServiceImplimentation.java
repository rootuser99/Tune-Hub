package com.example.music.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.music.entities.Song;
import com.example.music.repositories.SongRepository;

@Service
public class SongServiceImplimentation implements SongService 
{
	@Autowired
	SongRepository repo;
	@Override
	public void addSong(Song song) {
		repo.save(song);
	}
	@Override
	public List<Song> fetchAllSongs() {

		return repo.findAll();
	}
	@Override
	public boolean songExists(String name) {

		Song song=repo.findByName(name);
		if(song==null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	@Override
	public void updateSong(Song song) {

		repo.save(song);
	}

}
