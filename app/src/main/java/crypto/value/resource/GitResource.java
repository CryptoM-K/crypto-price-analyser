package crypto.value.resource;

import crypto.value.entity.git.Commit;
import crypto.value.service.GitService;
import io.quarkus.scheduler.Scheduled;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("git")
public class GitResource {

    @Inject
    @RestClient
    GitService gitService;

    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Commit> getAllCommits(String coinPath, String since) {
        return gitService.getAllCommits("bitcoin/bitcoin", "2022-01-15T00:00:01");
    }

    @Scheduled(cron = "{cron.expr}")
    public void schedule() {
        List<Commit> commits = gitService.getAllCommits("bitcoin/bitcoin", "2022-01-15T00:00:01");
        //TODO zapisywanie do bazy
    }

    @GET
    @Path("status")
    @Produces(MediaType.TEXT_PLAIN)
    public Response status() {
        return Response.ok("Git OK").build();
    }
}
