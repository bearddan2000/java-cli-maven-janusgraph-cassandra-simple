package example;

import org.janusgraph.core.JanusGraph;
import org.janusgraph.core.JanusGraphFactory;

public class Main {
    public static void main(String[] args) {
        JanusGraph janusGraph = JanusGraphFactory.build()
            .set("storage.backend", "cql")
            .set("storage.hostname", "db:9042")
            .open();
        janusGraph.close();
    }
}
