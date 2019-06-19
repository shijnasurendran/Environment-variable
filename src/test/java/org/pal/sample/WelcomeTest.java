package org.pal.sample;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class WelcomeTest {

    @Test
    public void hello()
    {
        Welcome welcome=new Welcome("hi there", "this is a sentence");
        assertThat(welcome.hello()).isEqualTo("hi there");
        assertThat(welcome.sentence()).isEqualTo("this is a sentence");
    }
}
