package com.example.music.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.music.entities.Playlist;

public interface PlayListRepository extends JpaRepository<Playlist, Integer>
{

}
