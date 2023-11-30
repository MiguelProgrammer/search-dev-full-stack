package br.com.desafioavanade.searchdev.dto;

import br.com.desafioavanade.searchdev.enums.Acting;
import br.com.desafioavanade.searchdev.enums.Stack;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class AnalystDto {
	private Integer pId;
	private Acting actuation;
	private Stack stack;

}

