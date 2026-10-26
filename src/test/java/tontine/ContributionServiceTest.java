
package tontine;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ContributionServiceTest {

  @Test
  void rejectsZeroContribution() {
    ContributionService service = new ContributionService();

    assertThrows(IllegalArgumentException.class,
        () -> service.contribute("member-1", 0));
  }

  @Test
  void rejectsNegativeContribution() {
    ContributionService service = new ContributionService();

    assertThrows(IllegalArgumentException.class,
        () -> service.contribute("member-1", -500));
  }

  @Test
  void acceptsPositiveContribution() {
    ContributionService service = new ContributionService();

    assertDoesNotThrow(() -> service.contribute("member-1", 5000));
  }
}