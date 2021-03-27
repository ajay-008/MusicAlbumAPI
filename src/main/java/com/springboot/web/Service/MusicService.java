package com.springboot.web.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springboot.web.dao.MusicRepository;
import com.springboot.web.dao.MusicianRepository;
import com.springboot.web.entities.Music;
import com.springboot.web.entities.Musicians;

@Component
public class MusicService {

	@Autowired
	private MusicRepository musicRepository; // DAO Inject

	@Autowired
	private MusicianRepository musicianRepository;

	

	// Get all Musics albums sorted by Price

	public List<Object[]> getAllMusicSortedByPrice(String id) {

		 List<Object[]> allMusicSortedByPrice = musicRepository.getAllMusicSortedByPrice(id);
		
		System.out.println("allMusicSortedByPrice**"+allMusicSortedByPrice.toString());
		
		return allMusicSortedByPrice;

	}
	
	//end
	
	public List<Object[]> getAllMusicSortedByMusicianName(String id, String name) {

		 List<Object[]> allMusicSortedByName = musicianRepository.getAllMusicSortedByMusicianName(id, name);
		
		System.out.println("allMusicSortedByName**"+allMusicSortedByName.toString());
		
		return allMusicSortedByName;

	}
	
	

	// Get all Musics

	public List<Music> getAllMusic() {

		List<Music> listmusic = (List<Music>) musicRepository.findAll();
		return listmusic;

	}

	// Get all Musicians

	public List<Musicians> getAllMusicians() {

		List<Musicians> listmusician = (List<Musicians>) musicianRepository.findAll();
		return listmusician;

	}

	// Adding the Musician

	public Musicians addMusician(Musicians b) {
		Musicians musician = musicianRepository.save(b);
		System.out.println("Value at Service**" + musician);
		return musician;

	}

	// Update the Musician

	public Musicians updateMusician(Musicians musician) {
		Musicians m = musicianRepository.save(musician);
		System.out.println("Value at Service**" + m);
		return m;

	}

	// get single music
	public Optional<Music> getAllBooksByID(int id) {

		Optional<Music> music = null;

		music = musicRepository.findById(id);
		return music;

	}

	// Adding the Music

	public Music addMusic(Music b) {
		Music music = musicRepository.save(b);
		System.out.println("Value at Service**" + music);
		return music;

	}

	// Update the Music

	public Music updateMusic(Music music) {
		Music m = musicRepository.save(music);
		System.out.println("Value at Service**" + m);
		return m;

	}

}
