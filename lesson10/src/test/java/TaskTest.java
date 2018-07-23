import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TaskTest {

    private static class TestCase{
        String name;
        int a;
        int b;
        int expected;

        public TestCase(String name, int a, int b, int expected) {
            this.name = name;
            this.a = a;
            this.b = b;
            this.expected = expected;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    @DataProvider
    Object[][] dataProvider(){
        return new TestCase[][]{
                new TestCase[]{new TestCase("Zero", 2, -2, 0)},
                new TestCase[]{new TestCase("Max", Integer.MAX_VALUE - 1, 1, Integer.MAX_VALUE)},
                new TestCase[]{new TestCase("Min", Integer.MIN_VALUE + 1, -1, Integer.MIN_VALUE)},
                };
    }

    @Test(dataProvider = "dataProvider")
    public void testItWorksWithProvider(TestCase testCase){
        Assert.assertEquals(Task.add(testCase.a, testCase.b), testCase.expected, "Case" + testCase.name);
    }

    @Test
    public void testItWorks(){
        Assert.assertEquals(Task.add(2,3), 5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void overflowThrowException(){
        Assert.assertEquals(Task.add(Integer.MAX_VALUE,1), Integer.MIN_VALUE);
    }


}
