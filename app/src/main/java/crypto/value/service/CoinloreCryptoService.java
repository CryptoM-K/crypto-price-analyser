package crypto.value.service;

import crypto.value.entity.coinlore.CoinloreResponse;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
@ApplicationScoped
@RegisterRestClient(configKey = "crypto_api")
public interface CoinloreCryptoService {

    @GET
    @Path("/api/tickers/")
    @Produces(MediaType.APPLICATION_JSON)
    CoinloreResponse getAllCoins();
}
