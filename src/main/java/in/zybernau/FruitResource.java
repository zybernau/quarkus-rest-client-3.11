package in.zybernau;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@Path( "/fruits1")
public class FruitResource {

    @RestClient
    FruitService fruitService;

    @GET
    @Path("/")
    public Uni<List<Fruit>> getFruits(){
        return fruitService.getFruits();
    }

}
