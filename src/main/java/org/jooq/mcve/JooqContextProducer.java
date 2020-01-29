package org.jooq.mcve;


import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import io.agroal.api.AgroalDataSource;

@Dependent
public class JooqContextProducer {

    @Inject
    AgroalDataSource dataSource;

    @Produces
    DSLContext dslContext() {
        return DSL.using(dataSource, SQLDialect.POSTGRES);
    }

}