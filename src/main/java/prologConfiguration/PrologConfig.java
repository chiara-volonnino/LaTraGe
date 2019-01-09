package prologConfiguration;

import alice.tuprolog.InvalidTheoryException;
import alice.tuprolog.Prolog;
import alice.tuprolog.Theory;

import java.io.FileInputStream;
import java.io.IOException;

public class PrologConfig {

    public static Prolog engine;

    public PrologConfig(final String fileName) throws IOException, InvalidTheoryException {
        Theory theory = new Theory(new FileInputStream(fileName));
        this.engine = new Prolog();
        this.engine.setTheory(theory);

    }

    public Prolog getEngine(){
        return engine;
    }
}
