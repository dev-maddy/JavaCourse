package com.te.final_mail;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class MailClass {
		@Id
		private int id;
		private String name;
		private String password;
}
