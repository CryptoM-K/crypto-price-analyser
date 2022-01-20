package crypto.value.resource;

import crypto.value.entity.coinlore.CoinloreResponse;
import crypto.value.service.CoinloreCryptoService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("coin")
public class CoinloreCryptoResource {

    @Inject
    @RestClient
    CoinloreCryptoService coinloreCryptoService;

    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public CoinloreResponse getAllCoinsInfo() {
        //TODO zapisywanie do bazy
        return coinloreCryptoService.getAllCoins();
    }

    @GET
    @Path("/status")
    @Produces(MediaType.TEXT_PLAIN)
    public Response status() {
        return Response.ok("Coinlore Crypto OK").build();
    }


}
