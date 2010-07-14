/*
 * Copyright (c) 2010 Mysema Ltd.
 * All rights reserved.
 *
 */
package com.mysema.query.sql.types;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

/**
 * @author tiwe
 *
 */
public class URLType implements Type<URL>{

    @Override
    public URL getValue(ResultSet rs, int startIndex) throws SQLException {
        return rs.getURL(startIndex);
    }

    @Override
    public Class<URL> getReturnedClass() {
        return URL.class;
    }

    @Override
    public void setValue(PreparedStatement st, int startIndex, URL value)
            throws SQLException {
        st.setURL(startIndex, value);
    }

    @Override
    public int[] getSQLTypes() {
        return new int[]{Types.VARCHAR};
    }

}
