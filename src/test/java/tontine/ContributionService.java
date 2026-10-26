package tontine;

public class ContributionService {

  public void contribute(String memberId, long amountFcfa) {
    if (amountFcfa <= 0) {
      throw new IllegalArgumentException("Contribution must be greater than zero");
    }
  }
}