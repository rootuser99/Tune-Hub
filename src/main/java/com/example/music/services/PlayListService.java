package com.example.music.services;

import java.util.List;

import com.example.music.entities.Playlist;

public interface PlayListService
{

	public void addPlaylist(Playlist playlist);
	
	public List<Playlist>fetchAllPlaylists();
}
