package com.sample.integrationtest.integration_test;

/**
 * Hello world!
 *
 */
public class App 
{
   /* public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }*/
	
	private String name;
	private Integer id;
	private Integer secret;
	
	public Integer calculatedKey () {
		return id = secret;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSecret() {
		return secret;
	}

	public void setSecret(Integer secret) {
		this.secret = secret;
	}
	
	
}
