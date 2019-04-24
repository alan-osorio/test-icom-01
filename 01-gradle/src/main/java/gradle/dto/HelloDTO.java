package gradle.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public @Data class HelloDTO implements Serializable {

	@Getter @Setter	
	private String saludo;
	private String name;
}
