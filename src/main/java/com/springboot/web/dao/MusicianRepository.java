package com.springboot.web.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.web.entities.Musicians;

public interface MusicianRepository extends JpaRepository<Musicians, Integer>{
	
	
	//In the below query put the POJO variable named 
	@Query("SELECT b.Musicians_Name FROM Music a,Musicians b WHERE a.Album_ID = b.Album_ID AND a.Album_ID =:n AND a.Album_Name =:m ORDER BY b.Musicians_Name ASC\r\n"
			+ "")
	public List<Object[]> getAllMusicSortedByMusicianName(@Param("n") String albumId, @Param("m") String albumName);


}
