package nagarro.exitassignment.productCatalogue.model;

public class JwtResponse {
 String token;

public String getToken() {
	return token;
}

public void setToken(String token) {
	this.token = token;
}

public JwtResponse(String token) {
	super();
	this.token = token;
}

public JwtResponse() {
	super();
	// TODO Auto-generated constructor stub
}
 
 
}
