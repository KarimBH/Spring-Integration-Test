package test.springInt;

import org.springframework.beans.factory.annotation.Value;

public class SearchCarQuery {
	@Value("#{searchCarQuery}")
	private String searchCarquery;

	public String getSearchCarquery() {
		return searchCarquery;
	}

	public void setSearchCarquery(String searchCarquery) {
		this.searchCarquery = searchCarquery;
	}

}
