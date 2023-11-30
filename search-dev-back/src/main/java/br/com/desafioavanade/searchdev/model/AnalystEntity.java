package br.com.desafioavanade.searchdev.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "analyst")
public class AnalystEntity implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "pId")
	private Long pId;
	@Column(name = "acting")
	private String actuation;
	@Column(name = "stack")
	private String stack;

	public void setpId(Long pId) {
		this.pId = pId;
	}

	public void setActuation(String actuation) {
		this.actuation = actuation;
	}

	public void setStack(String stack) {
		this.stack = stack;
	}
}

