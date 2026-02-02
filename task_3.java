@RunWith(Parameterized.claspublic class CheckIsAdultTest
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
    this.result = result;
  }

  @Parameterized.Parameters
  public static Object[][] getTextData() {
        return new Object[][] {
                {15, false},
        {25, true},
        {18, true},
        {17, false},
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
          Program program = new Program();
    boolean isAdult = program.checkIsAdult(age);
    assertEquals("Возраст попадает в другую категорию", result, isAdult);
        }
}
