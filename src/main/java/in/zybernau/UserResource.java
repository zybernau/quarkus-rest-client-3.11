package in.zybernau;

import io.quarkus.rest.client.reactive.QuarkusRestClientBuilder;
import io.smallrye.mutiny.Uni;
import io.vertx.core.http.HttpClientOptions;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.net.URI;
import java.util.Set;

@Path("/user")
public class UserResource {
    @RestClient
    UserService userService;

//    public UserResource() {
//        HttpClientOptions options = new HttpClientOptions();
//        userService = QuarkusRestClientBuilder.newBuilder()
//                .baseUri(URI.create("http://localhost:8083/user/users"))
//                .httpClientOptions(options)
//                .build(UserService.class);
//    }

    @GET
    @Path("/users")
    public Uni<UserModel> users() {
        return userService.getUsers();
    }
}
