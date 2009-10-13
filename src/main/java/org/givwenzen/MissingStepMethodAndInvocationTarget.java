package org.givwenzen;

public class MissingStepMethodAndInvocationTarget extends MethodAndInvocationTarget {

  public static final String MATCH_ANY_STRING = ".*";

  public MissingStepMethodAndInvocationTarget() {
    super(null, null, null);
  }

  @Override
  public Object invoke(String methodString) throws Exception {
    throw new DomainStepNotFoundException(
        "\nYou need a step class with an annotated method matching this pattern: '" + methodString + "'\n" +
        "The step class should be placed in the package or sub-package of bdd.steps or your custom package if defined.\n" +
        "Example:\n" +
        "  @DomainSteps\n" +
        "  public class StepClass {\n" +
        "    @DomainStep(\"" + methodString + "\")\n" +
        "    public void domainStep() {\n" +
        "      // TODO implement step\n" +
        "    }" +
        "  }");  
    }

  @Override
  public String getMethodAsString() {
    return ".stepnotfound";
  }
}
