package in.zybernau;

import io.vertx.core.http.HttpClientOptions;
import jakarta.ws.rs.ext.ContextResolver;

public class CustomHttpClientOptions implements ContextResolver<HttpClientOptions> {

    @Override
    public HttpClientOptions getContext(Class<?> aClass) {
        HttpClientOptions options = new HttpClientOptions();
        // ...
        return options;
    }
}
