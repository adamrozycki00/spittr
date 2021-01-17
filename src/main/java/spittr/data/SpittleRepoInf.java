package spittr.data;

import spittr.Spittle;

import java.util.List;

public interface SpittleRepoInf {

    List<Spittle> findSpittles(long max, int count);

    Spittle findOne(long spittleId);

}
