package com.lendingApp.main.entity;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "profile_picture")
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class ProfilePicture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID profilePictureId;
	
	 private String picName;
	 private String picURL;
	 private LocalDateTime picUploadedAt;
	
	@OneToOne(mappedBy = "profilePicture")
	private User user;
}
