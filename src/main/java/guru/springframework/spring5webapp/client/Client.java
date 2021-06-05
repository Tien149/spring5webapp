package guru.springframework.spring5webapp.client;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	private String Email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String mail) {
		this.Email = mail;
	}
	
	
	
	
	
}
