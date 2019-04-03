import java.util.Scanner;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class MainGETId {

	public static void main(String[] args) {
		Client client = Client.create();
		System.out.println("Digite um código");
		Scanner scn = new Scanner(System.in);
		int entrada = scn.nextInt();
		
		WebResource resource = client.resource("http://localhost:8080/14-LojaAppPUT/rest/produto/"+ entrada);
		ClientResponse response = resource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		
		if (response.getStatus() == 200) {
			ProdutoTO produto = response.getEntity(ProdutoTO.class);
			System.out.println(produto.getDescricao());
		} else {
			System.out.println("Erro - HTTP Status: " + response.getStatus());
		}
	}

}
