package com.example.music.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class NavigationContoller 
{
@GetMapping("/login")
public String login()
{
    return "login";
}

@GetMapping("/registration")
public String registration()
{
    return "registration";
}
@GetMapping("/newSong")
 public String newSong()
 {
	return "newSong";
 }
}
