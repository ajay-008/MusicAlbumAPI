package com.springboot.web.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JukeBox_Musicians")
public class Musicians {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "Album_ID", length = 255)
	private String Album_ID;

	@Column(name = "Musicians_Name", length = 255)
	private String Musicians_Name;

	@Column(name = "Musicians_Type", length = 255)
	private String Musicians_Type;

	public Musicians() {
		super();
	}

	public Musicians(int id, String album_ID, String musicians_Name, String musicians_Type) {
		super();
		this.id = id;
		Album_ID = album_ID;
		Musicians_Name = musicians_Name;
		Musicians_Type = musicians_Type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlbum_ID() {
		return Album_ID;
	}

	public void setAlbum_ID(String album_ID) {
		Album_ID = album_ID;
	}

	public String getMusicians_Name() {
		return Musicians_Name;
	}

	public void setMusicians_Name(String musicians_Name) {
		Musicians_Name = musicians_Name;
	}

	public String getMusicians_Type() {
		return Musicians_Type;
	}

	public void setMusicians_Type(String musicians_Type) {
		Musicians_Type = musicians_Type;
	}

	@Override
	public String toString() {
		return "Musicians [id=" + id + ", Album_ID=" + Album_ID + ", Musicians_Name=" + Musicians_Name
				+ ", Musicians_Type=" + Musicians_Type + "]";
	}

}
