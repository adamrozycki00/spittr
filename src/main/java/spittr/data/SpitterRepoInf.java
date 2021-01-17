package spittr.data;

import spittr.Spitter;

public interface SpitterRepoInf {

    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);

}
