package com.example.music.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.music.entities.Playlist;
import com.example.music.entities.Song;
import com.example.music.services.PlayListService;
import com.example.music.services.SongService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class PlayListController 
{
	@Autowired
	SongService songservice;
	
	@Autowired
	PlayListService playlistservice;
@GetMapping( "/createPlaylist")
	public String createPlaylist(Model model)
	{
	List<Song> SongList=songservice.fetchAllSongs();
	model.addAttribute("Songs",SongList);
	return "createPlaylist";
	}

@PostMapping("/addPlaylist")
public String addPlaylist(@ModelAttribute Playlist playlist) {
    
	playlistservice.addPlaylist(playlist);
	List<Song> SongList=playlist.getSongs();
	for(Song s :SongList)
	{
		s.getPlaylist().add(playlist);
		songservice.updateSong(s);
	}
    return "adminHome";
}


@GetMapping("/viewPlaylists")
public String viewPlaylists(Model model) 
{
	List<Playlist> allPlaylists=playlistservice.fetchAllPlaylists();
	model.addAttribute("allPlaylists",allPlaylists);
    return "displayPlaylists";
}

}
