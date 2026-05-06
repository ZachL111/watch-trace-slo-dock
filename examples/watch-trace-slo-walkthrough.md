# Watch Trace Slo Dock Walkthrough

This note is the quickest way to read the extra review model in `watch-trace-slo-dock`.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | span volume | 110 | watch |
| stress | latency skew | 157 | ship |
| edge | signal loss | 137 | watch |
| recovery | incident shape | 172 | ship |
| stale | span volume | 170 | ship |

Start with `recovery` and `baseline`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

`recovery` is the optimistic case; use it to make sure the scoring path still rewards strong signal.
