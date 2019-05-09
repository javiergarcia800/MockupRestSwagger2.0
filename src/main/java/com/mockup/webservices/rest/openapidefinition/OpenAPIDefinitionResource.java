package com.mockup.webservices.rest.openapidefinition;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

/**
 * OpenAPIDefinition Example
 */
@OpenAPIDefinition(
        info = @Info(
                title = "Pet Resource Example",
                version = "2.0",
                description = "API Definition",
                //termsOfService = "Terms of service",
                license = @License(name = "Apache 2.0", url = "http://foo.bar"),
                contact = @Contact(url = "http://gigantic-server.com", name = "Fred", email = "Fred@gigagantic-server.com")
        ),
        /*tags = {
                @Tag(name = "Tag 1", description = "desc 1", externalDocs = @ExternalDocumentation(description = "docs desc")),
                @Tag(name = "Tag 2", description = "desc 2", externalDocs = @ExternalDocumentation(description = "docs desc 2")),
                @Tag(name = "Tag 3")
        },*/
        //externalDocs = @ExternalDocumentation(description = "definition docs desc"),
        /*security = {
                @SecurityRequirement(name = "req 1", scopes = {"a", "b"}),
                @SecurityRequirement(name = "req 2", scopes = {"b", "c"})
        },*/
        servers = {
                @Server(
                        description = "server 1",
                        url = "http://localhost:8080/MockupRestSwagger2.0-1.0.0"/*,
                        variables = {
                                @ServerVariable(name = "var1", description = "var 1", defaultValue = "1", allowableValues = {"1", "2"}),
                                @ServerVariable(name = "var2", description = "var 2", defaultValue = "1", allowableValues = {"1", "2"})
                        }*/)
        }
)
public class OpenAPIDefinitionResource {

}
