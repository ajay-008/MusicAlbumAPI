package com.springboot.web.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "JukeBox_Music")

public class Music {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "Album_ID", length = 255)

	private String Album_ID;

	@Column(name = "Album_Name", length = 255)
	private String Album_Name;
	@Column(name = "Date_of_release", length = 255)
	private String Date_of_release;
	@Column(name = "Genre", length = 255)
	private String Genre;
	@Column(name = "Price", length = 255)
	private double Price;
	@Column(name = "Description", length = 255)
	private String Description;

	public Music() {
		super();
	}

	public Music(int id, String album_ID, String album_Name, String date_of_release, String genre, double price,
			String description) {
		// super();
		this.id = id;
		this.Album_ID = album_ID;
		this.Album_Name = album_Name;
		this.Date_of_release = date_of_release;
		this.Genre = genre;
		this.Price = price;
		this.Description = description;
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
		this.Album_ID = album_ID;
	}

	public String getAlbum_Name() {
		return Album_Name;
	}

	public void setAlbum_Name(String album_Name) {
		this.Album_Name = album_Name;
	}

	public String getDate_of_release() {
		return Date_of_release;
	}

	public void setDate_of_release(String date_of_release) {
		this.Date_of_release = date_of_release;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		this.Genre = genre;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		this.Price = price;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		this.Description = description;
	}

	@Override
	public String toString() {
		return "Music [id=" + id + ", Album_ID=" + Album_ID + ", Album_Name=" + Album_Name + ", Date_of_release="
				+ Date_of_release + ", Genre=" + Genre + ", Price=" + Price + ", Description=" + Description + "]";
	}

}
