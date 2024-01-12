package com.example.music.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.music.entities.Playlist;
import com.example.music.repositories.PlayListRepository;

@Service
public class PlayListServiceImplementation implements PlayListService 
{
	@Autowired
PlayListRepository repo;
	@Override
	public void addPlaylist(Playlist playlist) 
	{
		repo.save(playlist);
	}
	@Override
	public List<Playlist> fetchAllPlaylists() {

		return repo.findAll();
	}

}
