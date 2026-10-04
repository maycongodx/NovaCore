package com.nova.plugins.core.sqlprovider.connector;

import com.nova.plugins.core.sqlprovider.connector.type.SQLDatabaseType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.sql.Connection;
import java.util.function.Consumer;

/**
 * @author Henry Fábio
 */
@Getter
@RequiredArgsConstructor
public abstract class SQLConnector {
    private final SQLDatabaseType databaseType;

    public abstract void consumeConnection(Consumer<Connection> consumer);
}
