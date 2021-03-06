package org.assertj.examples.data;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link Employee.Title} specific assertions - Generated by CustomAssertionGenerator.
 */
public abstract class AbstractEmployeeTitleAssert<S extends AbstractEmployeeTitleAssert<S, A>, A extends Employee.Title> extends AbstractAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractEmployeeTitleAssert}</code> to make assertions on actual Employee.Title.
   * @param actual the Employee.Title we want to make assertions on.
   */
  protected AbstractEmployeeTitleAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual Employee.Title's position is equal to the given one.
   * @param position the given position to compare the actual Employee.Title's position to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Employee.Title's position is not equal to the given one.
   */
  public S hasPosition(String position) {
    // check that actual Employee.Title we want to make assertions on is not null.
    isNotNull();


    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting position of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // check
    String actualPosition = actual.getPosition();
    System.out.println("check Position");
    if (!Objects.areEqual(actualPosition, position)) {
      failWithMessage(assertjErrorMessage, actual, position, actualPosition);
    }

    // return the current assertion for method chaining
    return myself;
  }

}
