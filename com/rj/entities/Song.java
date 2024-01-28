package com.rj.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Song {
	//songid, songName, songArtist this actual created table name db
	
	@Id
	@Column(name = "songid")
	private int id;
	
	@Column(name="songName")
	private String songName;
	
	@Column(name="songArtist")
	private String artist;
	
	
	public Song() {
		super();
	}
  
	public Song(int id, String songName, String artist) {
		super();
		this.id = id;
		this.songName = songName;
		this.artist = artist;
	}
  
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	//require for ReadApp program
	@Override
	public String toString() {
		return "Song [id=" + id + ", songName=" + songName + ", artist=" + artist + "]";
	}
	
	
}

