package in.zybernau;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.Set;

@Path("/users")
@RegisterRestClient(configKey = "user-api")
public interface UserService {

    @GET
    @Path("/{page}")
    Uni<PagedUsers> getUsers( @PathParam("page") Long page);
}
