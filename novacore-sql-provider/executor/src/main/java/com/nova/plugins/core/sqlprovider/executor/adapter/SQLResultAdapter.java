package com.nova.plugins.core.sqlprovider.executor.adapter;

import com.nova.plugins.core.sqlprovider.executor.result.SimpleResultSet;

/**
 * @author Henry Fábio
 */
public interface SQLResultAdapter<T> {
    T adaptResult(SimpleResultSet resultSet);
}