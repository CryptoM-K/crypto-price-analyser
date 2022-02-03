package crypto.value.parser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import crypto.value.entity.json.CryptoRepoInfo;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import java.io.File;
import java.io.IOException;
import java.util.List;

@ApplicationScoped
public class CryptoRepoInfoParser {

    @ConfigProperty(name = "crypto.info.path")
    String path;

    public List<CryptoRepoInfo> getCryptoRepoInfo() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File(path), new TypeReference<>() {
        });
    }
}
