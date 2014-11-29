package jpa.springInt.test;

import java.util.List;

import org.springframework.integration.annotation.Payload;
import org.springframework.stereotype.Service;

import jpa.springInt.entities.Agency;
@Service
public interface AgencyServices {
	Agency addAgency(Agency agency);

	@Payload("new java.util.Date()")
	List<Agency> findAgency();
}
