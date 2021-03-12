import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class AppTest {

    @Test
    public void reverseArrayInPlace_singleString() {
        //Given
        String[] input = new String[]{"A"};

        //When
        String[] output = App.reverseArrayInPlace(input);

        //Then
        String[] expect = new String[]{"A"};
        System.out.println(Arrays.toString(output));
        Assert.assertArrayEquals(output, input);
    }

    @Test
    public void reverseArrayInPlace_TwoStrings() {
        //Given
        String[] input = new String[]{"A", "B"};

        //When
        String[] output = App.reverseArrayInPlace(input);

        //Then
        String[] expect = new String[]{"B", "A"};
        System.out.println(Arrays.toString(output));
        Assert.assertArrayEquals(expect, output);
    }

    @Test
    public void reverseArrayInPlace_GivenChallenge() {
        //Given
        String[] input = new String[]{"1", "2", "3", "A", "B", "C"};

        //When
        String[] output = App.reverseArrayInPlace(input);

        //Then
        String[] expect = new String[]{"C", "B", "A", "3", "2", "1"};
        System.out.println(Arrays.toString(output));
        Assert.assertArrayEquals(expect, output);
    }

    @Test
    public void reverseArrayInPlace_OddElements() {
        //Given
        String[] input = new String[]{"1", "2", "3", "4", "A", "B", "C"};

        //When
        String[] output = App.reverseArrayInPlace(input);

        //Then
        String[] expect = new String[]{"C", "B", "A", "4", "3", "2", "1"};
        System.out.println(Arrays.toString(output));
        Assert.assertArrayEquals(expect, output);
    }

    @Test
    public void cheat_GivenChallenge() {
        //Given
        String[] input = new String[]{"1", "2", "3", "A", "B", "C"};

        //When
        App.cheat(input);

        //Then
        String[] expect = new String[]{"C", "B", "A", "3", "2", "1"};
        System.out.println(Arrays.toString(input));
        Assert.assertArrayEquals(expect, input);
    }
}