package com.demo.restclient;

import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.core.Response;

public class DemoRestClient {

	public static void main(String args[]) {
		ClientConfig config = new ClientConfig();
		
		Client client = ClientBuilder.newClient(config);
		
		WebTarget webTarget = client.target(getCustomURI());

//		String response = webTarget.path("rest")
//				                    .path("friends")
//				                    .path("delete")
//				                    .path("1")
//				                    .request()
//				                    .accept(MediaType.TEXT_PLAIN)
//									.get(Response.class)
//									.toString();
//
//		System.out.println(response);
//		
		String message = webTarget.path("rest")
                .path("friends")
                .path("delete")
                .path("1")
                .request()
                .accept(MediaType.APPLICATION_JSON)
				.delete()
				.toString();
System.out.println(message);
	}
	
	private static URI getCustomURI() {
	       
	return UriBuilder.fromUri("http://localhost:8080/CRUDJerseyFriends").build();
	}
	}
	

