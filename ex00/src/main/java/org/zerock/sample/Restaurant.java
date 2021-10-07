package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Component //이 클래스는 스프링에서 관리해야하는 대상임
@Data
public class Restaurant {
	
	@Setter(onMethod_=@Autowired)
	private Chef chef;
}
