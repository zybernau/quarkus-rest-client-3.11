package in.zybernau;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.Set;

@Path("/users")
@RegisterRestClient(configKey = "user-api")
public interface UserService {

    @GET
    Uni<UserModel> getUsers();
}
