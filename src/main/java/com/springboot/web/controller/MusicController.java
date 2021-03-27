package com.springboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.Service.MusicService;
import com.springboot.web.entities.Music;
import com.springboot.web.entities.Musicians;

//Controller->Service->DAO Layer (Repsitory)-> Database

@RestController
public class MusicController {

	@Autowired
	public MusicService musicService;

	// Get all the music details from database

	@GetMapping("/")

	public List<Music> getMusic() {

		return musicService.getAllMusic();
	}

	@GetMapping("/fetchMusician")

	public List<Musicians> getMusician() {

		return musicService.getAllMusicians();
	}

	@GetMapping("/fetchAllSortedByPrice/{album_id}")

	public List<Object[]> getAllSortedByPrice(@PathVariable("album_id") String id) {

		System.out.println("Inside getAllSortedByPrice");

		return musicService.getAllMusicSortedByPrice(id);
	}

	@GetMapping("/fetchAllSortedByMusicianName/{album_id}/{musician_name}")

	public List<Object[]> getAllSortedByMusicianName(@PathVariable("album_id") String id,
			@PathVariable("musician_name") String musicianName) {

		System.out.println("Inside getAllSortedByMusicianName");

		return musicService.getAllMusicSortedByMusicianName(id,musicianName);
	}

	@PostMapping("/setMusician")
	public Musicians addMusicianJukeBox(@RequestBody Musicians music) {

		System.out.println("Music object at controller**" + music);

		Musicians b = musicService.addMusician(music);
		System.out.println("Inserted values**" + b);
		return b;

	}

	@PutMapping("/updatemusician")
	public Musicians updateMusicianJukeBox(@RequestBody Musicians music) {

		System.out.println("Music update object at controller**" + music);

		Musicians b = musicService.updateMusician(music);
		System.out.println("Inserted values**" + b);
		return b;

	}

	// Posting the Music data in to the database

	@PostMapping("/music")
	public Music addMusicJukeBox(@RequestBody Music music) {

		System.out.println("Music object at controller**" + music);

		Music b = musicService.addMusic(music);
		System.out.println("Inserted values**" + b);
		return b;

	}

	@PutMapping("/updatemusic")
	public Music updateMusicJukeBox(@RequestBody Music music) {

		System.out.println("Music update object at controller**" + music);

		Music b = musicService.updateMusic(music);
		System.out.println("Inserted values**" + b);
		return b;

	}

}
