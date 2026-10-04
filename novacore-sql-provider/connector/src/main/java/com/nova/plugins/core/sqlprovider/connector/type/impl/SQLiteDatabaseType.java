package com.nova.plugins.core.sqlprovider.connector.type.impl;

import com.nova.plugins.core.sqlprovider.connector.type.FileDatabaseType;
import com.nova.plugins.core.sqlprovider.connector.util.FileUtil;
import lombok.Builder;

import java.io.File;

/**
 * @author Henry Fábio
 */
public final class SQLiteDatabaseType extends FileDatabaseType {
    @Builder
    public SQLiteDatabaseType(File file) {
        super(
                "org.sqlite.JDBC",
                "jdbc:sqlite:" + file,
                file
        );
        FileUtil.createFileIfNotExists(file);
    }
}