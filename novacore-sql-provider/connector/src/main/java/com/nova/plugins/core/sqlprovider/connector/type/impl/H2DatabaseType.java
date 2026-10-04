package com.nova.plugins.core.sqlprovider.connector.type.impl;

import com.nova.plugins.core.sqlprovider.connector.type.FileDatabaseType;
import com.nova.plugins.core.sqlprovider.connector.type.RemoteDatabaseType;
import com.nova.plugins.core.sqlprovider.connector.util.FileUtil;
import lombok.Builder;

import java.io.File;

public final class H2DatabaseType extends FileDatabaseType {
    @Builder
    public H2DatabaseType(File file) {
        super(
                "org.h2.Driver",
                "jdbc:h2:" + file,
                file
        );
    }
}