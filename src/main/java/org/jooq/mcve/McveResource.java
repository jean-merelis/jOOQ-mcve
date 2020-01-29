package org.jooq.mcve;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jooq.DSLContext;
import static org.jooq.mcve.tables.Test.TEST;

@Path("/mcve")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class McveResource {

    @Inject
    DSLContext dsl;

    @GET
    public List<TestDto> getRecords() {
        return dsl
        .selectFrom(TEST)
        .fetch(r -> {
            return new TestDto(r.getId(), r.getName());
        });

        
    }
}