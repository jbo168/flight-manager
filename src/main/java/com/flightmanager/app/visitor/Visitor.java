package com.flightmanager.app.visitor;

import com.flightmanager.app.model.Flight;

public interface Visitor {
    public int visit(Flight flight);
}
