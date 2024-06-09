package in.zybernau;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@Path("/fruits")
@RegisterRestClient(configKey = "fruit-api")
public interface FruitService {

    @GET
    Uni<List<Fruit>> getFruits();
}
