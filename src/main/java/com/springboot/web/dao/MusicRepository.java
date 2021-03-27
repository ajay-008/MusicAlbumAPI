package com.springboot.web.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.web.entities.Music;

//Extends JPARepository or CRUDRepository//DAO Layer
public interface MusicRepository extends JpaRepository<Music, Integer> {

	@Query("SELECT a.Album_ID,a.Album_Name,a.Date_of_release,a.Genre,a.Price,a.Description FROM Music a,Musicians b WHERE a.Album_ID = b.Album_ID AND a.Album_ID =:n ORDER BY a.Price ASC")
	public List<Object[]> getAllMusicSortedByPrice(@Param("n") String albumId);
	
	
}
