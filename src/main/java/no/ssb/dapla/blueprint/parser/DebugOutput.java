package no.ssb.dapla.blueprint.parser;

import no.ssb.dapla.blueprint.notebook.Notebook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DebugOutput {

    private static final Logger log = LoggerFactory.getLogger(DebugOutput.class);

    void output(Notebook notebook) {
        log.debug("Notebook {}", notebook.fileName);
    }
}