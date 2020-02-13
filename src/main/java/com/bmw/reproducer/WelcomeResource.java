package com.bmw.reproducer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class WelcomeResource {

	@PersistenceContext(name = "mpconfig")
	EntityManager entityManager;

    @GET
    public Welcome hello() {
        return entityManager.find(Welcome.class, 1l);
    }
}
