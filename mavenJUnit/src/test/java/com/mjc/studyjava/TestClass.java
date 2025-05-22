package com.mjc.studyjava;

import com.mjc813.mjc_library.MjcPoint;
import com.mjc813.mjc_library.SampleMarketInfo;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestClass {
    @Test
    public void testMjcPoint() {
        MjcPoint mp = new MjcPoint();
        assertThat(mp.getMarketPoint()).isEqualTo(100);
        assertThat(mp.addPoint(null, 10)).isEqualTo(100);
        assertThat(mp.addPoint(new IMarketTest(), 70)).isEqualTo(170);
        assertThat(mp.subPoint(null, 20)).isEqualTo(170);
        assertThat(mp.subPoint(new IMarketTest(), 10)).isEqualTo(160);
    }
}
