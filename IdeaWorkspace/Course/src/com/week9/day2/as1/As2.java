package com.week9.day2.as1;

interface Instrument {
    /**
     * Instrument play instrument
     */
    void play();
}

class Pinao implements Instrument {

    @Override
    public void play() {
        System.out.println("Play the piano");
    }
}

class Violin implements Instrument {
    @Override
    public void play() {
        System.out.println("Play the violin");
    }
}

class InstrumentTest {
    void testPlay(Instrument i) {
        i.play();
    }
}

/**
 * @author Lin
 */
public class As2 {
    public static void main(String[] args) {
        Instrument piano = new Pinao();
        Instrument violin = new Violin();
        new InstrumentTest().testPlay(piano);
        new InstrumentTest().testPlay(violin);
    }
}
