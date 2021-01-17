package spittr.data;

import org.springframework.stereotype.Repository;
import spittr.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class SpittleRepository implements SpittleRepoInf {

    public List<Spittle> findSpittles(long max, int count) {
        ArrayList<Spittle> spittles = new ArrayList<>();
        for (int i = 0; i < count; i++)
            spittles.add(new Spittle("Spittle " + i, new Date()));
        return spittles;
    }

    public Spittle findOne(long spittleId) {
        return new Spittle("Spittle " + spittleId, new Date());
    }

}
