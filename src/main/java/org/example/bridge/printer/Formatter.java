package org.example.bridge.printer;

import java.util.List;

public interface Formatter {
    String format(String header, List<Detail> details);
}
