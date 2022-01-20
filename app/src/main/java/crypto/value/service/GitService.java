package crypto.value.service;

import crypto.value.entity.git.Commit;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("repos")
@ApplicationScoped
@RegisterRestClient(configKey = "git_api")
public interface GitService {

    @GET
    @Path("/{path}/commits")
    @Produces(MediaType.APPLICATION_JSON)
    List<Commit> getAllCommits(@PathParam("path") String path, @QueryParam("since") String since);
}
