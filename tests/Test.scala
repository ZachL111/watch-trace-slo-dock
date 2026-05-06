object TestRunner {
  def main(args: Array[String]): Unit = {
    val signalcase_1 = Signal(75, 74, 8, 21, 4)
    assert(Policy.score(signalcase_1) == 98)
    assert(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(68, 72, 10, 16, 7)
    assert(Policy.score(signalcase_2) == 120)
    assert(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(68, 83, 19, 16, 8)
    assert(Policy.score(signalcase_3) == 117)
    assert(Policy.classify(signalcase_3) == "review")
    val domainReview = DomainReview(51, 33, 28, 59)
    assert(DomainReviewLens.score(domainReview) == 110)
    assert(DomainReviewLens.lane(domainReview) == "watch")
  }
}
